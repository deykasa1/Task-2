import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CorrectTest {
    private int[] numbers = {1, 2, 3, 4, 5};

    @BeforeEach
    public void setUp() {
        System.out.println("Тестирование...");
    }

    @Test
    public void testMin() {
        assertEquals(_min(numbers), Arrays.stream(numbers).min().getAsInt());
    }

    @Test
    public void testMax() {
        assertEquals(_max(numbers), Arrays.stream(numbers).max().getAsInt());
    }

    @Test
    public void testSum() {
        assertEquals(_sum(numbers), Arrays.stream(numbers).sum());
    }

    @Test
    public void testMult() {
        assertEquals(_mult(numbers), Arrays.stream(numbers).reduce(1, (a, b) -> a * b));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Тест пройден");
    }

    private int _min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    private int _max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private int _sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    private int _mult(int[] arr) {
        return Arrays.stream(arr).reduce(1, (a, b) -> a * b);
    }
}