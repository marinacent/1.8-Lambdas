package level_1.exercise_1;

import java.util.List;
import java.util.Locale;

public class FilterStringList {

    public static List<String> getElementsWithO(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o"))
                .toList();
    }

    public static void printElementsWithO(List<String> list) {
        getElementsWithO(list).forEach(System.out::println);
        System.out.println();
    }

    public static List<String> getElementsWithOLongerThan5(List<String> list) {
        return FilterStringList.getElementsWithO(list).stream()
                .filter((a) -> a.length() > 5)
                .toList();
    }

    public static void printElementsWithOLongerThan5(List<String> list) {
        getElementsWithOLongerThan5(list).forEach(System.out::println);
        System.out.println();
    }
}
