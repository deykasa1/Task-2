import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeedTest {

    private long startTime;
    private long endTime;
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    @BeforeEach
    public void setUp() {
        startTime = 0;
        endTime = 0;
        System.out.println("Тестирование...");
    }

    @Test
    public void testTimeMin() {
        System.out.println("Функция поиска минимума:");
        startTime = System.currentTimeMillis();
        Main._min(numbers);
        endTime = System.currentTimeMillis();
    }

    @Test
    public void testTimeMax() {
        System.out.println("Функция поиска максимума:");
        startTime = System.currentTimeMillis();
        Main._max(numbers);
        endTime = System.currentTimeMillis();
    }

    @Test
    public void testTimeSum() {
        System.out.println("Функция поиска суммы чисел:");
        startTime = System.currentTimeMillis();
        Main._sum(numbers);
        endTime = System.currentTimeMillis();
    }

    @Test
    public void testTimeMult() {
        System.out.println("Функция поиска произведения чисел:");
        startTime = System.currentTimeMillis();
        Main._mult(numbers);
        endTime = System.currentTimeMillis();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Тест пройден");
        System.out.println("Время выполнения для массива длиной 5 равно " + ((double)(endTime - startTime) / 1000) + " секунд.");
    }
}