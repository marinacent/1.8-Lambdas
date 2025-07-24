package level_1.exercise_8;

public class Main {
    public static void main(String[] args) {
        /*

        "abcde" --> 01234
        "edcba" --> 43210
        len = 5 -->
        for (int i = len(list) - 1; i < 0; i--)
        append list.get(i)

                 */
        String first = "first";
        String second = "second";
        String numbers = "12345";

        Reverser rev = (a) -> {
            StringBuilder b = new StringBuilder();
            for (int i = a.length() - 1; i > -1; i--) {
                b.append(a.charAt(i));
            }
            return b.toString();
        };

        System.out.println(rev.reverse(first));
        System.out.println(rev.reverse(second));
        System.out.println(rev.reverse(numbers));


    }
}
