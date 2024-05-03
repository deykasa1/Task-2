import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String name = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String[] values = reader.readLine().split(" ");
            for (String val : values) {
                numbers.add(Integer.parseInt(val));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Минимум: " + _min(numbers));
        System.out.println("Максимум: " + _max(numbers));
        System.out.println("Сумма: " + _sum(numbers));
        System.out.println("Произведение: " + _mult(numbers));
    }

    public static int _min(List<Integer> mas) {
        if (mas.isEmpty()) {
            System.out.println("Пустой файл");
            return Integer.MAX_VALUE;
        }
        int minn = Integer.MAX_VALUE;
        for (int val : mas) {
            if (val < minn) {
                minn = val;
            }
        }
        return minn;
    }

    public static int _max(List<Integer> mas) {
        if (mas.isEmpty()) {
            return 0;
        }
        int maxx = Integer.MIN_VALUE;
        for (int val : mas) {
            if (val > maxx) {
                maxx = val;
            }
        }
        return maxx;
    }

    public static int _sum(List<Integer> mas) {
        if (mas.isEmpty()) {
            System.out.println("Пустой файл");
            return 0;
        }
        int summ = 0;
        for (int val : mas) {
            summ += val;
        }
        return summ;
    }

    public static int _mult(List<Integer> mas) {
        if (mas.isEmpty()) {
            System.out.println("Пустой файл");
            return 1;
        }
        if (mas.contains(0)) {
            return 0;
        }
        int mult = 1;
        for (int val : mas) {
            mult *= val;
        }
        return mult;
    }
}