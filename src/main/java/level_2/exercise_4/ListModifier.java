package level_2.exercise_4;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ListModifier {

    public static List<String> modifyList(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .sorted(Comparator.comparing((a) -> !a.toLowerCase(Locale.ROOT).contains("e")))
                .map((a) -> a.replaceAll("[aA]", "4"))
                .filter((a) -> a.matches("-?[0-9]*,?[0-9]*"))
                .toList();
    }
}
