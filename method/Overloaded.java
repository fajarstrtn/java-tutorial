
public class Overloaded {

    public static void main(String[] args) {

        printMessage(calculate(10));
        printMessage(calculate(99.1254));
        printMessage(calculate(10, 10));
        printMessage(calculate(9.9, 10.1));

        calculate(1.9, 20.5, 5.01);

        printMessage(10);
        printMessage(9.185f);
        printMessage(10, 9.185f);
        printMessage(10, "Hello", 100_000_000_000l);
        printMessage();

    }

    private static int calculate(int x) {

        return x * 1;

    }

    private static int calculate(int x, int y) {

        return x * y;

    }

    private static double calculate(double x) {

        return x * 1.0;

    }

    private static double calculate(double x, double y) {

        return x * y;

    }

    private static void calculate(double x, double y, double z) {

        printMessage(x, y, z);

    }

    private static void printMessage(int number) {

        System.out.println(number + " is an integer");

    }

    private static void printMessage(double number) {

        System.out.println(number + " is a double");

    }

    private static void printMessage(int firstNumber, double lastNumber) {

        System.out.println(firstNumber + " is an integer");
        System.out.println(lastNumber + " is a double");

    }

    private static void printMessage(int firstNumber, String middleString, long lastNumber) {

        System.out.println(firstNumber + " is an integer");
        System.out.println(middleString + " is a string");
        System.out.println(lastNumber + " is a long");

    }

    private static void printMessage(double firstNumber, double middleString, double lastNumber) {

        System.out.println(firstNumber + " is an integer");
        System.out.println(middleString + " is a string");
        System.out.println(lastNumber + " is a long");

        System.out.println(firstNumber * middleString * lastNumber);

    }

    private static void printMessage() {

        System.out.println("No method passed by");

    }

}
