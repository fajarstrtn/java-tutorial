
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long days = minutes % (60 * 24 * 365) / 1440;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void main(String[] args) {
        printYearsAndDays(1000000); // Output: 1000000 min = 1 y and 329 d
        printYearsAndDays(525678);  // Output: 525678 min = 1 y and 0 d
        printYearsAndDays(525600);  // Output: 525600 min = 1 y and 0 d
        printYearsAndDays(1440);    // Output: 1440 min = 0 y and 1 d
        printYearsAndDays(-1);      // Output: Invalid value
    }

}
