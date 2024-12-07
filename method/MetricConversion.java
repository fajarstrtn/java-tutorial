
public class MetricConversion {

    public static void main(String[] args) {

        double inchesToCentiMeters = convertToCentiMeters(5);
        double feetAndinchesToCentiMeters = convertToCentiMeters(7, 9);

        System.out.println("inch(es) to centimeter(s): " + inchesToCentiMeters);
        System.out.println("feet and inch(es) to centimeter(s): " + feetAndinchesToCentiMeters);

    }

    private static double convertToCentiMeters(int inches) {

        return inches * 2.54;

    }

    private static double convertToCentiMeters(int feet, int inches) {

        return ((feet * 12) + inches) * 2.54;

    }
}
