package level_1.exercise_8;

public class Main {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";
        String numbers = "12345";

        Reverser rev = (a) -> {
            StringBuilder b = new StringBuilder();
            for (int i = a.length() - 1; i >= 0; i--) {
                b.append(a.charAt(i));
            }
            return b.toString();
        };

        System.out.println(rev.reverse(first));
        System.out.println(rev.reverse(second));
        System.out.println(rev.reverse(numbers));


    }
}
