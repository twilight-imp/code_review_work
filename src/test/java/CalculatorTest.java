import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(5, 2));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(8, 2));
        assertThrows(ArithmeticException.class, () -> calculator.div(2, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(3, 2));
    }

    @Test
    void solver() {
        int result = calculator.solver(2, 3);
        assertEquals(-5, result);
    }
}
