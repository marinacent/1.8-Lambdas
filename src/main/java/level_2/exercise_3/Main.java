package level_2.exercise_3;

public class Main {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (float a, float b) -> a * b;
        Operation division = (float a, float b) -> a / b;

        float firstNumber = 3;
        float secondNumber = 2;

        System.out.println(addition.operation(firstNumber, secondNumber));
        System.out.println(subtraction.operation(firstNumber, secondNumber));
        System.out.println(multiplication.operation(firstNumber, secondNumber));
        System.out.println(division.operation(firstNumber, secondNumber));
    }
}

