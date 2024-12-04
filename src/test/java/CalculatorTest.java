import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(6, calculator.add(3, 3));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(5, 2));
         }

    @Test
    void div() {
        assertEquals(4, calculator.div(8, 2));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(3, 2));
    }

    @Test
    void solver() {
        int result = calculator.solver(2, 3);
        assertEquals(7, result);
    }
}