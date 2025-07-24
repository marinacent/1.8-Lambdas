package level_1.exercise_1;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
        List<String> cityList = Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

        System.out.println("---- EXERCISE 1 ----");
        FilterStringList.printElementsWithO(nameList);
        FilterStringList.printElementsWithO(cityList);

        System.out.println("---- EXERCISE 2 ----");
        FilterStringList.printElementsWithOLongerThan5(nameList);
        FilterStringList.printElementsWithOLongerThan5(cityList);
    }
}
