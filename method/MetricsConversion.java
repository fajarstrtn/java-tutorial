
public class MetricsConversion {

    private static double convertToCentiMeters(int inches) {
        if (inches < 0) {
            System.err.println("Negative inches value is not allowed");
            return 0;
        }
        return inches * 2.54;
    }

    private static double convertToCentiMeters(int feet, int inches) {
        if (feet < 0 || inches < 0) {
            System.err.println("Negative feet or inches value is not allowed");
            return 0;
        }
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentiMeters(totalInches);
    }

    public static void main(String[] args) {
        double inchesToCentiMeters = convertToCentiMeters(15);
        System.out.println(inchesToCentiMeters);

        double feetAndInchesToCentiMeters = convertToCentiMeters(25, 14);
        System.out.println(feetAndInchesToCentiMeters);
    }

}
