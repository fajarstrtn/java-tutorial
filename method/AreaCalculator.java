
public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(4.5));
        System.out.println(area(197.23131));
        System.out.println(area(-4.5));

        System.out.println(area(50.8, 7));
        System.out.println(area(5, 8));
        System.out.println(area(-1.5, 89.08));

    }

    public static double area(double radius) {

        if (radius < 0)
            return -1.0;

        return (3.1415926535898 * Math.pow(radius, 2));

    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0)
            return -1.0;

        return x * y;
    }

}
