import java.net.http.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import com.google.gson.*;
import java.util.Scanner;

public class ConversionService {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    // ✅ Pega aquí tu API Key de ExchangeRate-API
    private static final String API_KEY = "TU_API_KEY_AQUI";

    // Lista de monedas disponibles
    private static final String[] MONEDAS = {"USD", "ARS", "BRL", "COP", "CLP"};

    public static void convertir(Scanner sc, String desde, String hacia) {
        System.out.print("Ingrese el monto a convertir de " + desde + " a " + hacia + ": ");
        double monto;
        try {
            monto = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Monto inválido. Debe ingresar un número.");
            return;
        }

        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + desde + "/" + hacia + "/" + monto;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            if (json.get("result").getAsString().equals("success")) {
                double conversionRate = json.get("conversion_rate").getAsDouble();
                double resultado = conversionRate * monto;
                System.out.println(String.format("%.2f %s = %.2f %s", monto, desde, resultado, hacia));
            } else {
                System.out.println("Error en la conversión: " + json.get("error-type").getAsString());
            }

        } catch (IOException | InterruptedException | URISyntaxException e) {
            System.out.println("Error al conectarse con la API: " + e.getMessage());
        }
    }

    public static void conversionPersonalizada(Scanner sc) {
        Menu.mostrarMonedas(MONEDAS);

        System.out.print("Elija el número de la moneda de origen: ");
        int origenIdx = elegirMoneda(sc);
        if (origenIdx == -1) return;

        System.out.print("Elija el número de la moneda de destino: ");
        int destinoIdx = elegirMoneda(sc);
        if (destinoIdx == -1) return;

        String desde = MONEDAS[origenIdx];
        String hacia = MONEDAS[destinoIdx];

        convertir(sc, desde, hacia);
    }

    private static int elegirMoneda(Scanner sc) {
        int idx;
        try {
            idx = Integer.parseInt(sc.nextLine()) - 1;
            if (idx < 0 || idx >= MONEDAS.length) {
                System.out.println("Selección inválida.");
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, debe ser un número.");
            return -1;
        }
        return idx;
    }
}

