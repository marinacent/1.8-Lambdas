package level_1.exercise_3_4;

import java.util.Arrays;
import java.util.List;

public class Months {
    private static final List<String> MONTHS = Arrays.asList("January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December");

    public static void printMonthsLambda() {
        MONTHS.forEach(month -> System.out.println(month));
    }

    public static void printMonthsMethodReference() {
        MONTHS.forEach(System.out::println);
    }
}
