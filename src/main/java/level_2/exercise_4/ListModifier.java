package level_2.exercise_4;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ListModifier {
    // I wasn't sure if I needed to output one list modified in 4 ways or 4 different lists
    // I did it both ways

    public static List<String> modifyList(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .sorted(Comparator.comparing((a) -> !a.toLowerCase(Locale.ROOT).contains("e")))
                .map((a) -> a.replaceAll("[aA]", "4"))
                .filter((a) -> a.matches("-?[0-9]*,?[0-9]*"))
                .toList();
    }

    public static List<String> sortAlphabetically(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
    }

    public static List<String> containsEFirst(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing((a) -> !a.toLowerCase(Locale.ROOT).contains("e")))
                .toList();
    }

    public static List<String> replaceAby4(List<String> list) {
        return list.stream()
                .map((a) -> a.replaceAll("[aA]", "4"))
                .toList();
    }

    public static List<String> getNumbersOnly(List<String> list) {
        return list.stream()
                .filter((a) -> a.matches("-?[0-9]*,?[0-9]*"))
                .toList();
    }
}
