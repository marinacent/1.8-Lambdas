package level_2.exercise_4;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "Hola", "9", "Bon dia", "987654", "Bona nit",
                "a", "aeiou", "0000000000", "No", "A reveure", "-2", "4,5");

        ListModifier.modifyList(list).forEach(System.out::println);
        System.out.println();

        ListModifier.sortAlphabetically(list).forEach(System.out::println);
        System.out.println();
        ListModifier.containsEFirst(list).forEach(System.out::println);
        System.out.println();
        ListModifier.replaceAby4(list).forEach(System.out::println);
        System.out.println();
        ListModifier.getNumbersOnly(list).forEach(System.out::println);
        System.out.println();


    }
}
