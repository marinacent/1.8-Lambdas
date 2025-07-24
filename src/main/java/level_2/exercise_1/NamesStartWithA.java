package level_2.exercise_1;

import java.util.List;

public class NamesStartWithA {

    public static List<String> getNamesThatStartWithA(List<String> names) {
        return names.stream()
                .filter((a) -> a.charAt(0) == 'A')
                .toList();
    }

    public static void printNamesThatStartWithA(List<String> names) {
        getNamesThatStartWithA(names).forEach(System.out::println);
    }
}
