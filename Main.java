public class Main {
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
    }
}
