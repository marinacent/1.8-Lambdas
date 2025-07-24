package level_1.exercise_1;

import java.util.List;
import java.util.Locale;

public class WithO {

    public static List<String> getElementsWithO(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o"))
                .toList();
    }

    public static void printElementsWithO(List<String> list) {
        getElementsWithO(list).forEach(System.out::println);
        System.out.println();
    }


}
