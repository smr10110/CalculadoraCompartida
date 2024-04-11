public class Main {
    // Metodo para sumar dos numeros.
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Metodo para restar dos numeros.
    public static double restar(double a, double b) {
        return a - b;
    }

    // Metodo para multiplicar dos números.
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo para dividir dos numeros.
    public static double dividir(double a, double b) {
        return a / b;
    }

    // Metodo para encontrar el mayor de dos numeros.
    public static double mayor(double a, double b) {
        return (a > b) ? a : b;
    }

    // Metodo para encontrar el menor de dos numeros.
    public static double menor(double a, double b) {
        return (a < b) ? a : b;
    }

    // Metodo para calcular la potencia de un numero elevado a otro.
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular un porcentaje de un número.
    public static double porcentaje(double numero, double porciento) {
        return (numero * porciento) / 100.0;
    }

    // Metodo para calcular el discriminante de la ecuacion cuadratica. Soluciones reales, hacer pruebas unitarias
    public static double discriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static String evaluarDiscriminante(double discriminante) {
        if (discriminante > 0) {
            return "Dos raices reales y distintas";
        } else if (discriminante == 0) {
            return "Una unica raiz real";
        } else {
            return "No hay raices reales";
        }
    }

    // Método para calcular raíces reales y distintas.
    private static void calcularRaicesRealesDistintas(double a, double b, double discriminante) {
        double root1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        System.out.println("Raiz 1 = " + root1);
        System.out.println("Raiz 2 = " + root2);
    }

    // Método para calcular una única raíz real.
    private static void calcularRaizRealUnica(double a, double b) {
        double root = -b / (2 * a);
        System.out.println("Raíz única = " + root);
    }

    // Método para calcular raíces complejas.
    private static void calcularRaicesComplejas(double a, double b, double discriminante) {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-discriminante) / (2 * a);
        System.out.println("Raíz 1 = " + realPart + " + " + imaginaryPart + "i");
        System.out.println("Raíz 2 = " + realPart + " - " + imaginaryPart + "i");
    }

    // Método para calcular las raíces de una ecuación cuadrática, utilizando los métodos auxiliares.
    public static void calcularRaicesCuadraticas(double a, double b, double c) {
        double discriminante = discriminante(a, b, c);
        System.out.println(evaluarDiscriminante(discriminante));

        if (discriminante > 0) {
            calcularRaicesRealesDistintas(a, b, discriminante);
        } else if (discriminante == 0) {
            calcularRaizRealUnica(a, b);
        } else {
            calcularRaicesComplejas(a, b, discriminante);
        }
    }

    public static void main(String[] args) {
        double a = 1, b = -8, c =16;
        calcularRaicesCuadraticas(a, b, c);
    }
}