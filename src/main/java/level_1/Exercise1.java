package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exercise1 {
    private static final List<String> NAME_LIST = new ArrayList<>();
    private static final List<String> CITY_LIST = new ArrayList<>();

    static {
        NAME_LIST.addAll(Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep"));
        CITY_LIST.addAll(Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense"));
    }

    public static List<String> getElementsWithO(List<String> list) {

        return list.stream()
                .filter((a) -> a.toLowerCase(Locale.ROOT).contains("o"))
                .toList();
    }
}
