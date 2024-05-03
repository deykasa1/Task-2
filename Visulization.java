import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Visulization {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
        List<Integer> timecodes = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        for (int step = 0; step < numbers.size(); step += 5000) {
            List<Integer> currList = new ArrayList<>(numbers.subList(0, 1000 + step));
            value.add(currList.size());
            long start = System.currentTimeMillis();
            int sum = Main._sum(currList);
            long end = System.currentTimeMillis();
            int res = (int) (end - start);
            timecodes.add(res);
        }
        //здесь я получил данные о времени выполнения функции суммы
        //построил график с помощью стронних инструментов (прикрепил в проекте)
    }
}