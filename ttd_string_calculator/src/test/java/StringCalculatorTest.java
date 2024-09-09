import org.example.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
}
