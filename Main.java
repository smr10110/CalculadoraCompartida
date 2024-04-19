import java.util.Scanner;

public class Main {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("4. Calcular ecuación de una recta");
            System.out.println("5. Resolver sistema de ecuaciones lineales");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 5:
                    // Opción para calcular ecuación de una recta
                    System.out.println("Ingrese las coordenadas de los puntos:");
                    System.out.print("x1: ");
                    double x1 = scanner.nextDouble();
                    System.out.print("y1: ");
                    double y1 = scanner.nextDouble();
                    System.out.print("x2: ");
                    double x2 = scanner.nextDouble();
                    System.out.print("y2: ");
                    double y2 = scanner.nextDouble();

                    calcularEcuacionRecta(x1, y1, x2, y2);
                    break;
                case 4:
                    // Opción para resolver sistema de ecuaciones lineales
                    System.out.println("Ingrese los coeficientes y términos independientes:");
                    System.out.print("A: ");
                    double A = scanner.nextDouble();
                    System.out.print("B: ");
                    double B = scanner.nextDouble();
                    System.out.print("C: ");
                    double C = scanner.nextDouble();
                    System.out.print("D: ");
                    double D = scanner.nextDouble();
                    System.out.print("E: ");
                    double E = scanner.nextDouble();
                    System.out.print("F: ");
                    double F = scanner.nextDouble();

                    resolverSistemaEcuaciones(A, B, C, D, E, F);
                    break;
                case 6:
                    // Opción para salir del programa
                    System.out.println("Cerrando calculadora");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
    public static void resolverSistemaEcuaciones(double A, double B, double C, double D, double E, double F) {
        double determinante = A * E - B * D;

        if (determinante == 0) {
            System.out.println("El sistema de ecuaciones no tiene solución única.");
        } else {
            double x = (C * E - B * F) / determinante;
            double y = (A * F - C * D) / determinante;

            // Redondear los resultados a 2 decimales
            x = Math.round(x * 100.0) / 100.0;
            y = Math.round(y * 100.0) / 100.0;

            System.out.println("La solución del sistema de ecuaciones es: (x = " + x + ", y = " + y + ")");
        }
    }
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }
    public static double calcularTerminoIndependiente(double x1, double y1, double pendiente) {
        return y1 - pendiente * x1;
    }
    public static void calcularEcuacionRecta(double x1, double y1, double x2, double y2) {
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        double terminoIndependiente = calcularTerminoIndependiente(x1, y1, pendiente);


        // Mostrar la ecuación de la recta pasarlo al metodo mostrar más adelante
        System.out.println("La ecuación de la recta es: Y = " + pendiente + "X + " + terminoIndependiente);
    }


    public static void main(String[] args) {
        menu();
    }
}
