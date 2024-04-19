import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void testRaicesCuadraticasConAZero() {
        assertThrows(IllegalArgumentException.class, () -> Main.calcularRaicesCuadraticas(0, 2, 3));
    }

    @Test
    void testAreaCirculoConRadioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Main.areaCirculo(-1));
    }

    @Test
    void testPerimetroCuadradoConLadoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Main.perimetroCuadrado(-1));
    }

    @Test
    void testVolumenEsferaConRadioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Main.volumenEsfera(-1));
    }
}