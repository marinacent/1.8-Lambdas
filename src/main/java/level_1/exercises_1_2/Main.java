package level_1.exercises_1_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
        List<String> cityList = Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

        FilterStringList.printElementsWithO(nameList);
        FilterStringList.printElementsWithO(cityList);

        FilterStringList.printElementsWithOLongerThan5(nameList);
        FilterStringList.printElementsWithOLongerThan5(cityList);
    }
}
