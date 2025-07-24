package level_1.exercise_8;

public class Main {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";
        String numbers = "12345";

        Reverser rev = (a) -> new StringBuilder(a).reverse().toString();

        System.out.println(rev.reverse(first));
        System.out.println(rev.reverse(second));
        System.out.println(rev.reverse(numbers));


    }
}
