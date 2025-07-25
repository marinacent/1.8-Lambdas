package level_2.exercise_2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EvenOrOdd {

    public static String getEvenOrOddString(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List can't be null or empty");
        }

        return numbers.stream()
                .filter(Objects::nonNull)
                .map((n) -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }

}
