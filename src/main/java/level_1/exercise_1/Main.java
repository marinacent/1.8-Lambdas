package level_1.exercise_1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sophia", "Joan", "Neus", "Ariadna", "Miquel", "Josep");
        List<String> cityList = Arrays.asList("Oslo", "Madrid", "Barcelona", "Rome", "Riga", "Odense");

        WithO.printElementsWithO(nameList);
        WithO.printElementsWithO(cityList);
    }
}
