
public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(-8, 2021));
        System.out.println(getDaysInMonth(5, -2022));
        System.out.println(getDaysInMonth(10, 2023));
        System.out.println(getDaysInMonth(2, 2024));
        System.out.println(getDaysInMonth(2, 2025));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999)
            return false;

        return (year % 4 == 0 &&  year % 100 != 0) || (year % 400 == 0);

    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999)
            return -1;

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 ->
                isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 ->
                30;
            default ->
                -1;
        };

    }
}
