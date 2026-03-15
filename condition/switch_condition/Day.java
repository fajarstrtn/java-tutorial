
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Day {

    public static void main(String[] args) {
        Days selectedDay = Days.TUESDAY;
        String day = null;

        switch (selectedDay) {
            case Days.MONDAY ->
                day = "Monday";
            case Days.TUESDAY ->
                day = "Tuesday";
            case Days.WEDNESDAY ->
                day = "Wednesday";
            case Days.THURSDAY ->
                day = "Thursday";
            case Days.FRIDAY ->
                day = "Friday";
            case Days.SATURDAY ->
                day = "Saturday";
            case Days.SUNDAY ->
                day = "Sunday";
        }

        System.out.println(day); // Output: Tuesday

        String dayStatus = switch (selectedDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                "Weekday";
            case SATURDAY, SUNDAY ->
                "Weekend";
        };

        System.out.println(dayStatus); // Output: Weekday

        Integer number = 5;

        String printedValue = switch (number) {
            case 1 ->
                "One";
            case 2 ->
                "Two";
            case 3 ->
                "Three";
            case 4 ->
                "Four";
            case 5 ->
                "Five";
            case 6 ->
                "Six";
            case 7 ->
                "Seven";
            case 8 ->
                "Eight";
            case 9 ->
                "Nine";
            case 10 ->
                "Ten";
            default ->
                "Out of range";
        };

        System.out.println(printedValue); // Output: Five

        Object object = 11.5;

        String typeChecked = switch (object) {
            case Integer i ->
                "Integer: " + i;
            case Long l ->
                "Long: " + l;
            case Double d ->
                "Double: " + d;
            case Boolean b ->
                "Boolean: " + b;
            case String s when s.length() >= 10 ->
                "Length: " + s;
            case String s ->
                "Short string: " + s;
            case null ->
                "null";
            default ->
                "Unknown object";
        };

        System.out.println(typeChecked); // Output: Double: 11.5
    }

}
