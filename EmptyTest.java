import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EmptyTest {
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    @BeforeEach
    public void setUp() {
        System.out.println("Тестирование...");
    }

    @Test
    public void testNumbers() {
        assertNotEquals(numbers.size(), 0, "Пустой файл");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Тест пройден");
    }
}