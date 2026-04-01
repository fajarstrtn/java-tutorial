
public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (3.1415926535898 * Math.pow(radius, 2));
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(3.45));        // Output: 37.3928065593526
        System.out.println(area(197.23131));   // Output: 122208.55000983349
        System.out.println(area(-4.52));       // Output: -1.0
        System.out.println(area(50.81, 7.14)); // Output: 362.7834
        System.out.println(area(9.36, 7.44));  // Output: 69.6384
        System.out.println(area(-1.5, 89.08)); // Output: -1.0
    }

}
