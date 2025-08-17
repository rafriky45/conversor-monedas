public class Menu {
    public static void mostrarMenu() {
        System.out.println("""
            ********************************************************
            Sea bienvenido/a al Conversor de Moneda =]
            
            1) Dólar => Peso argentino
            2) Peso argentino => Dólar
            3) Dólar => Real brasileño
            4) Real brasileño => Dólar
            5) Dólar => Peso colombiano
            6) Peso colombiano => Dólar
            7) Dólar => Peso chileno
            8) Peso chileno => Dólar
            9) Conversión personalizada
            10) Salir
            Elija una opción válida:
            ********************************************************
            """);
    }

    public static void mostrarMonedas(String[] monedas) {
        System.out.println("Monedas disponibles:");
        for (int i = 0; i < monedas.length; i++) {
            System.out.println((i + 1) + ") " + monedas[i]);
        }
    }
}


