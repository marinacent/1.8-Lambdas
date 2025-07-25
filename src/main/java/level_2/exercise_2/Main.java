package level_2.exercise_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, null, 4, 5);

        System.out.println(EvenOrOdd.getEvenOrOddString(numbers));
    }
}
