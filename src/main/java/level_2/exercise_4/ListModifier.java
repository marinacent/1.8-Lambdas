package level_2.exercise_4;

import java.util.List;

public class ListModifier {

    public static List<String> modifyList(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
    }
}
