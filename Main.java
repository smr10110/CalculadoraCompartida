import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static int leerEntero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next(); // Limpiar el búfer del scanner para evitar un bucle infinito
            }
        }
        return numero;
    }
    public static double leerDouble(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.next(); // Limpiar el búfer del scanner para evitar un bucle infinito
            }
        }
        return numero;
    }


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

    public static void operacionesAritmeticas(double numero1, double numero2) {
        System.out.println("Operaciones aritméticas:");

        // Suma
        System.out.println("Suma: " + sumar(numero1, numero2));

        // Resta
        System.out.println("Resta: " + restar(numero1, numero2));

        // Multiplicación
        System.out.println("Multiplicación: " + multiplicar(numero1, numero2));

        // División
        System.out.println("División: " + dividir(numero1, numero2));

        // Mayor
        System.out.println("Mayor: " + mayor(numero1, numero2));

        // Menor
        System.out.println("Menor: " + menor(numero1, numero2));

        // Potencia
        System.out.println("Potencia: " + potencia(numero1, numero2));

        // Porcentaje
        System.out.println(numero2 + "% de " + numero1 + ": " + porcentaje(numero1, numero2));
    }
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
    public static void menuFigurasGeometricas(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Cono");
            System.out.println("7. Salir");

            int opcionFigura = leerEntero(scanner, "Ingrese su opción: ");

            switch (opcionFigura) {
                case 1:
                    // Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + areaCuadrado(ladoCuadrado));
                    System.out.println("Perímetro del cuadrado: " + perimetroCuadrado(ladoCuadrado));
                    break;
                case 2:
                    // Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + areaRectangulo(baseRectangulo, alturaRectangulo));
                    System.out.println("Perímetro del rectángulo: " + perimetroRectangulo(baseRectangulo, alturaRectangulo));
                    break;
                case 3:
                    // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    System.out.println("Área del círculo: " + areaCirculo(radioCirculo));
                    System.out.println("Perímetro del círculo: " + circunferenciaCirculo(radioCirculo));
                    break;
                case 4:
                    // Esfera
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    System.out.println("Área superficial de la esfera: " + areaEsfera(radioEsfera));
                    System.out.println("Volumen de la esfera: " + volumenEsfera(radioEsfera));
                    break;
                case 5:
                    // Cubo
                    System.out.print("Ingrese la arista del cubo: ");
                    double aristaCubo = scanner.nextDouble();
                    System.out.println("Área superficial del cubo: " + areaCubo(aristaCubo));
                    System.out.println("Volumen del cubo: " + volumenCubo(aristaCubo));
                    break;
                case 6:
                    // Cono
                    System.out.print("Ingrese el radio del cono: ");
                    double radioCono = scanner.nextDouble();
                    System.out.print("Ingrese la generatriz del cono: ");
                    double generatrizCono = scanner.nextDouble();
                    System.out.println("Área superficial del cono: " + areaCono(radioCono, generatrizCono));
                    System.out.println("Volumen del cono: " + volumenCono(radioCono, generatrizCono));
                    break;
                case 7:
                    // Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Ecuación cuadrática");
            System.out.println("3. Figuras geométricas");
            System.out.println("4. Calcular ecuación de una recta");
            System.out.println("5. Resolver sistema de ecuaciones lineales");
            System.out.println("6. Salir");

            int opcion = leerEntero(scanner, "Ingrese su opción: ");

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los dos numeros");
                    System.out.print("primer numero: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("segundo numero: ");
                    double num2 = scanner.nextDouble();
                    operacionesAritmeticas(num1,num2);
                    break;

                case 2:
                    // Llamar a la función para resolver ecuación cuadrática
                    System.out.println("Ingrese los coeficientes de la ecuación cuadrática (ax^2 + bx + c = 0):");
                    System.out.print("a: ");
                    double a = scanner.nextDouble();
                    System.out.print("b: ");
                    double b = scanner.nextDouble();
                    System.out.print("c: ");
                    double c = scanner.nextDouble();
                    calcularRaicesCuadraticas(a, b, c);
                    break;
                case 3:
                    // Opción para calcular figuras geométricas
                    menuFigurasGeometricas(scanner);
                    break;

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