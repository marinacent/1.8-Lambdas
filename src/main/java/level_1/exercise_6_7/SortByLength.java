package level_1.exercise_6_7;

import java.util.Comparator;
import java.util.List;

public class SortByLength {

    public static List<String> sortByLengthAscending(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    public static List<String> sortByLengthDescending(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
    }
}
