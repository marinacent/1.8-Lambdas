package level_2.exercise_2;

import java.util.List;

public class EvenOrOdd {

    public static String getEvenOrOddString(List<Integer> numbers) {
        if (numbers == null) { return ""; }
        StringBuilder nums = new StringBuilder();
        numbers.forEach((n) -> {
            if (n % 2 == 0) {
                nums.append("e").append(n).append(", ");
            } else {
                nums.append("o").append(n).append(", ");
            }
        });


        return nums.substring(0, nums.length() - 2);
    }

}
