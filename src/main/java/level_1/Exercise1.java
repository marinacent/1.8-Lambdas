package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Exercise1 {
    private static final List<String> NAME_LIST =
            Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
    private static final List<String> CITY_LIST =
            Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

    public static List<String> getElementsWithO(List<String> list) {
        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o"))
                .toList();
    }

    public static void printElementsWithO(List<String> list) {
        for (String str : getElementsWithO(list)) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static void exercise1() {
        printElementsWithO(NAME_LIST);
        printElementsWithO(CITY_LIST);
    }


}
