import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        // Test avec des entrées positives
        int result1 = calculator.add(2, 3);
        Assertions.assertEquals(5, result1);

        // Test avec des entrées négatives
        int result2 = calculator.add(-5, -7);
        Assertions.assertEquals(-12, result2);

        // Test avec une entrée nulle
        int result3 = calculator.add(0, 10);
        Assertions.assertEquals(10, result3);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        // Test avec des entrées positives
        int result1 = calculator.subtract(10, 5);
        Assertions.assertEquals(5, result1);

        // Test avec des entrées négatives
        int result2 = calculator.subtract(-7, -3);
        Assertions.assertEquals(-4, result2);

        // Test avec une entrée nulle
        int result3 = calculator.subtract(10, 0);
        Assertions.assertEquals(10, result3);
    }
}
