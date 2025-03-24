
public class Greetings {

    public static void main(String[] args) {

        sayHi();

        try {
            int number = divideTwoNumbers(1, 2);
            System.out.println("Result: " + number);

            long superNumber = calculateMultiplication(100, 400);
            System.out.println("Result: " + superNumber);
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
    }

    private static void sayHi() {

        System.out.println("Hello, this is a prompt!");

    }

    private static int divideTwoNumbers(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;

    }

    private static long calculateMultiplication(long firstNumber, long secondNumber) {

        return firstNumber * secondNumber;

    }

}
