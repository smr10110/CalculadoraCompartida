import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSumar() {
        assertEquals(5, Main.sumar(2, 3)); // Prueba simple
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> Main.dividir(10, 0)); // Prueba para la division por cero
    }

    @Test
    public void testPotenciaCeroCero() {
        assertEquals(1, Main.potencia(0, 0)); // Prueba para potencia de cero elevado a cero
    }

    @Test
    public void testDiscriminanteNegativo() {
        double resultado = Main.discriminante(1, 0, 1);
        assertEquals("No hay raices reales", Main.evaluarDiscriminante(resultado)); // Prueba para el calculo de discriminante negativo
    }

    @Test
    public void testRaicesCuadraticasDiscriminanteCero() {
        double resultado = Main.discriminante(1, -2, 1);
        assertEquals("Una unica raiz real", Main.evaluarDiscriminante(resultado)); // Prueba para verificar el manejo de una raiz cuadratica real y unica
    }

    @Test
    public void testAreaCirculo() {
        assertEquals(Math.PI, Main.areaCirculo(1)); // Prueba para el area de un circulo con radio 1
    }

    @Test
    public void testAreaCirculoConRadioNegativo() {
        assertEquals(Double.NaN, Main.areaCirculo(-1)); // Prueba para el area de un circulo con radio negativo
    }
}
