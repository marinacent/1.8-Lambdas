package level_1.exercise_1_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
        List<String> cityList = Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

        System.out.println(FilterStringList.getElementsWithO(nameList));
        System.out.println();
        System.out.println(FilterStringList.getElementsWithO(cityList));
        System.out.println();

        System.out.println(FilterStringList.getElementsWithOLongerThan5(nameList));
        System.out.println();
        System.out.println(FilterStringList.getElementsWithOLongerThan5(cityList));

    }
}
