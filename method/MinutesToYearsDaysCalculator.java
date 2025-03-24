
public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(1000000);
        printYearsAndDays(525678);
        printYearsAndDays(525600);
        printYearsAndDays(1440);
        printYearsAndDays(-1);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / (60 * 24 * 365);
        long days = minutes % (60 * 24 * 365) / 1440;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }

}
