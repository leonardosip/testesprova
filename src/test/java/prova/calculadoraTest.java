package prova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	private final calculadora calculadora = new calculadora();

    @Test
    void testSomar() {
        assertEquals(6, calculadora.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void testDividirPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(1, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }

}
