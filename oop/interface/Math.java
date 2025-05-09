
public class Math implements Arithmetic, AnotherArithmetic {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public double divide(double x, int y) {
        return x / y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        var math = new Math();

        System.out.println("Addition: " + math.add(2, 2));
        System.out.println("Subtraction: " + math.subtract(10, 5));
        System.out.println("Division: " + math.divide(15, 3));
        System.out.println("Multiplication: " + math.multiply(5, 5));
    }

}

interface Arithmetic {

    int add(int x, int y);

    int subtract(int x, int y);

}

interface AnotherArithmetic {

    double divide(double x, int y);

    int multiply(int x, int y);

}
