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

    public static double dividir(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            return Double.NaN; //
        }
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
        try {
            if (base == 0 && exponente == 0) {
                throw new IllegalArgumentException("0 elevado a 0 es una indeterminacion");
            }
            return Math.pow(base, exponente);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }

    // Método para calcular un porcentaje de un número.
    public static double porcentaje(double numero, double porciento) {
        return (numero * porciento) / 100.0;
    }

    // Metodo para calcular el discriminante de la ecuacion cuadratica
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
    private static void calcularRaicesReales(double a, double b, double discriminante) {
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

    // Metodo para calcular las raices de una ecuacion cuadratica, utilizando los metodos auxiliares
    public static void calcularRaicesCuadraticas(double a, double b, double c) {
        double discriminante = discriminante(a, b, c);
        System.out.println(evaluarDiscriminante(discriminante));

        if (discriminante > 0) {
            calcularRaicesReales(a, b, discriminante);
        } else if (discriminante == 0) {
            calcularRaizRealUnica(a, b);
        } else {
            calcularRaicesComplejas(a, b, discriminante);
        }
    }

    // Metodo para calcular el perimetro de un cuadrado
    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    // Metodo para calcular el area de un cuadrado
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Metodo para calcular el perimetro de un rectangulo
    public static double perimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    // Metodo para calcular el area de un rectangulo
    public static double areaRectangulo(double largo, double ancho){
        return largo * ancho;
    }

    // Metodo para calcular la circunferencia de un circulo
    public static double circunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // Metodo para calcular el area de un circulo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Metodo para calcular el area superficial de una esfera
    public static double areaEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    // Metodo para calcular el volumen de una esfera
    public static double volumenEsfera(double radio) {
        return (4.0/3) * Math.PI * Math.pow(radio, 3);
    }

    // Metodo para calcular el area superficial de un cubo
    public static double areaCubo(double arista) {
        return 6 * arista * arista;
    }

    // Metodo para calcular el volumen de un cubo
    public static double volumenCubo(double arista) {
        return Math.pow(arista, 3);
    }

    // Metodo para calcular el area superficial de un cono
    public static double areaCono(double radio, double generatriz) {
        return Math.PI * radio * (radio + generatriz);
    }

    // Metodo para calcular el volumen de un cono
    public static double volumenCono(double radio, double altura) {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    public static void main(String[] args) {
        System.out.println("El resultado de la potencia es " + potencia(0, 0));
    }
}