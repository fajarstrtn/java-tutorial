
public class Overloaded {

    public static void main(String[] args) {

        printMessage(10);
        printMessage(9.185f);
        printMessage(10, 9.185f);

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
}
