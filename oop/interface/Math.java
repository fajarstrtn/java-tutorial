
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

        System.out.println("addition: " + math.add(2, 2));
        System.out.println("subtraction: " + math.subtract(10, 5));
        System.out.println("division: " + math.divide(15, 3));
        System.out.println("multiplication: " + math.multiply(5, 5));

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
