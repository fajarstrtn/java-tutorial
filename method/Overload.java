
public class Overload {

    private static int calculate(int x) {
        return x * 1;
    }

    private static int calculate(int x, int y) {
        return x * y;
    }

    private static double calculate(double x) {
        return x * 10;
    }

    private static double calculate(double x, double y) {
        return x * y;
    }

    private static void calculate(double x, double y, double z) {
        print(x, y, z);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void print(double number) {
        System.out.println(number);
    }

    private static void print(int firstNumber, double lastNumber) {
        System.out.println(firstNumber);
        System.out.println(lastNumber);
    }

    private static void print(int firstNumber, String middleString, long lastNumber) {
        System.out.println(firstNumber);
        System.out.println(middleString);
        System.out.println(lastNumber);
    }

    private static void print(double firstNumber, double middleString, double lastNumber) {
        System.out.println(firstNumber);
        System.out.println(middleString);
        System.out.println(lastNumber);
        System.out.println(firstNumber * middleString * lastNumber);
    }

    private static void print() {
        System.out.println("No parameters found");
    }

    public static void main(String[] args) {
        print(calculate(10));         // Output: 10
        print(calculate(99.1254));    // Output: 991.254
        print(calculate(10, 10));     // Output: 100
        print(calculate(9.9, 10.1));  // Output: 99.99
        print(10);                    // Output: 10
        print(9.185f);                // Output: 9.1850004196167
        print(10, 9.185f);            // Output: 10\n9.1850004196167
        print(10, "Hello", 100_000l); // Output: 10\nHello\n100000
        calculate(1.9, 20.5, 5.01);   // Output: 1.9\n20.5\n5.01
        print();                      // Output: No parameters found
    }

}
