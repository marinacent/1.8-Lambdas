package level_1.exercise_1_2;

import java.util.List;
import java.util.Locale;

public class FilterStringList {

    public static List<String> getElementsWithO(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o"))
                .toList();
    }

    public static List<String> getElementsWithOLongerThan5(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o") && a.length() > 5)
                .toList();
    }
}
