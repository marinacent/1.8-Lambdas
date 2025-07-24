package level_1.exercise_6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> exampleList = Arrays.asList("123", "Hola", "9", "Bon dia", "987654", "Bona nit",
                "a", "aeiou", "0000000000", "A reveure");

        SortByLength.printSortedList(exampleList);
    }
}
