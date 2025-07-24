package level_1.exercise_6;

import java.util.Comparator;
import java.util.List;

public class SortByLength {

    public static List<String> sortByLength(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    public static void printSortedList(List<String> list) {
        sortByLength(list).forEach(System.out::println);
    }
}
