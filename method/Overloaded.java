
public class Overloaded {

    public static void main(String[] args) {

        printMessage(10);
        printMessage(9.185f);
        printMessage(10, 9.185f);
        printMessage(10, "hello", 100_000_000_000l);

    }

    private static void printMessage(int number) {

        System.out.println(number + " is an integer");

    }

    private static void printMessage(float number) {

        System.out.println(number + " is a float");

    }

    private static void printMessage(int firstNumber, float lastNumber) {

        System.out.println(firstNumber + " is an integer");
        System.out.println(lastNumber + " is a float");

    }

    private static void printMessage (int firstNumber, String middleString, long lastNumber) {

        System.out.println(firstNumber + " is an integer");
        System.out.println(middleString + " is a string");
        System.out.println(lastNumber + " is a long");

    }
}
