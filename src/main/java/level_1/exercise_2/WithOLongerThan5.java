package level_1.exercise_2;

import java.util.List;
import java.util.Locale;

public class WithOLongerThan5 {

    public static List<String> getElementsWithOLongerThan5(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o") && a.length() > 5)
                .toList();
    }

    public static void printElementsWithOLongerThan5(List<String> list) {
        getElementsWithOLongerThan5(list).forEach(System.out::println);
        System.out.println();
    }
}
