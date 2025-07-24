package level_2.exercise_2;

import java.util.List;

public class EvenOrOdd {

    public static String getEvenOrOddString(List<Integer> numbers) {
        StringBuilder nums = new StringBuilder();
        numbers.forEach((n) -> {
            if (n % 2 == 0) {
                nums.append("e" + n + ", ");
            } else {
                nums.append("o" + n + ", ");
            }
        });


        return nums.substring(0, nums.length() - 2);
    }

}
