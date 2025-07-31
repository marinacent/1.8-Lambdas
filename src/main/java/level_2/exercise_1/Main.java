package level_2.exercise_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Andreu", "Joan", "Ava", "Pep");

        System.out.println(NameFilterer.get3LetterNamesWithInitialA(names));
    }
}
