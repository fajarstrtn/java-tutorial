
public class MetricConversion {

    public static void main(String[] args) {

        double inchesToCentiMeters = convertToCentiMeters(5);
        double feetAndinchesToCentiMeters = convertToCentiMeters(7, 9);

        System.out.println("inch(es) to centimeter(s): " + inchesToCentiMeters);
        System.out.println("feet and inch(es) to centimeter(s): " + feetAndinchesToCentiMeters);

    }

    private static double convertToCentiMeters(int inches) {

        if (inches < 0) {
            System.err.println("negative inches value is not allowed");
            return 0;
        }

        return inches * 2.54;

    }

    private static double convertToCentiMeters(int feet, int inches) {

        if (feet < 0 || inches < 0) {
            System.err.println("Negative feet or inches value is not allowed");
            return 0;
        }

/*      this code below is simpler but has low-readability

        return ((feet * 12) + inches) * 2.54;
        
        try change this with: */
        
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentiMeters(totalInches);
        return result;

    }
}
