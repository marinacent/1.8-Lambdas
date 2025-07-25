package level_2.exercise_2;

import java.util.List;

public class EvenOrOdd {

    public static String getEvenOrOddString(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List can't be null or empty");
        }
        StringBuilder nums = new StringBuilder();
        numbers.forEach((n) -> {
            if (n == null) { return; }
            if (n % 2 == 0) {
                nums.append("e").append(n).append(", ");
            } else {
                nums.append("o").append(n).append(", ");
            }
        });

        if (nums.isEmpty()) { return ""; }
        return nums.substring(0, nums.length() - 2);
    }

}
