
public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(10.5);  // Output: 10.5 km/h = 7 mi/h
        printConversion(-10.5); // Output: Invalid value
    }

}
