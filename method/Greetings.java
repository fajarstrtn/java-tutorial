
public class Greetings {

    public static void main(String[] args) {

        sayHi();

        try {

            int number = divideTwoNumbers(1, 2);

            System.out.println("Result: " + number);
            
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
}