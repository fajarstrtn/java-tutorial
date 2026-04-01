
public class Calculation {

    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static void main(String[] args) {
        try {
            System.out.println(add(10, 20));        // Output: 30
            System.out.println(subtract(15, 7));    // Output: 8
            System.out.println(divide(70, 7));      // Output: 10
            System.out.println(multiply(100, 400)); // Output: 40000
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
    }

}
