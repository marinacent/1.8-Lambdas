package level_2.exercise_1;

import java.util.List;

public class NameFilterer {

    public static List<String> get3LetterNamesWithInitialA(List<String> names) {
        if (names == null) { return List.of(); }
        return names.stream()
                .filter((name) -> name.charAt(0) == 'A' && name.length() == 3)
                .toList();
    }

    public static void print3LetterNamesWithInitialA(List<String> names) {
        get3LetterNamesWithInitialA(names).forEach(System.out::println);
    }
}
