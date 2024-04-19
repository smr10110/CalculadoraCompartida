public class Main {
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
        // Ejemplo de puntos
        double x1 = 1.0;
        double y1 = 3.0;
        double x2 = 2.0;
        double y2 = -5.0;


        calcularEcuacionRecta(x1, y1, x2, y2);

        double A = 2.0;
        double B = 3.0;
        double C = 5.0;
        double D = 1.0;
        double E = -1.0;
        double F = 3.0;

        resolverSistemaEcuaciones(A, B, C, D, E, F);

    }
}
