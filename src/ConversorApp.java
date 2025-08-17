import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Menu.mostrarMenu();
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> ConversionService.convertir(sc, "USD", "ARS");
                case "2" -> ConversionService.convertir(sc, "ARS", "USD");
                case "3" -> ConversionService.convertir(sc, "USD", "BRL");
                case "4" -> ConversionService.convertir(sc, "BRL", "USD");
                case "5" -> ConversionService.convertir(sc, "USD", "COP");
                case "6" -> ConversionService.convertir(sc, "COP", "USD");
                case "7" -> ConversionService.convertir(sc, "USD", "CLP");
                case "8" -> ConversionService.convertir(sc, "CLP", "USD");
                case "9" -> ConversionService.conversionPersonalizada(sc);
                case "10" -> {
                    System.out.println("¡Gracias por usar el conversor!");
                    continuar = false;
                }
                default -> System.out.println("Opción inválida, intenta nuevamente.");
            }

            if (continuar) {
                System.out.println("\nPresiona Enter para volver al menú...");
                sc.nextLine();
            }
        }

        sc.close();
    }
}


