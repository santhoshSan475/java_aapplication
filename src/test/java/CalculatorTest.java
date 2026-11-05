import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        Calculator c = new Calculator();
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator c = new Calculator();
        assertEquals(25, c.multiply(5, 5));
    }

}