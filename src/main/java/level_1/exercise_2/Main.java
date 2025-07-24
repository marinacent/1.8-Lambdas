package level_1.exercise_2;

import level_1.exercise_1.WithO;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
        List<String> cityList = Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

        WithOLongerThan5.printElementsWithOLongerThan5(nameList);
        WithOLongerThan5.printElementsWithOLongerThan5(cityList);
    }
}
