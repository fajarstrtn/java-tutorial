
public class EvolutionarySwitchCase {

    public static void main(String[] args) {

        Days selectedDay = Days.TUESDAY;
        String day = null;
    
        switch (selectedDay) {
            case Days.MONDAY ->
                day = "monday";
            case Days.TUESDAY ->
                day = "tuesday";
            case Days.WEDNESDAY ->
                day = "wednesday";
            case Days.THURSDAY ->
                day = "thursday";
            case Days.FRIDAY ->
                day = "friday";
            case Days.SATURDAY ->
                day = "saturday";
            case Days.SUNDAY ->
                day = "sunday";
        }

        String dayStat = switch (selectedDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "weekday";
            case SATURDAY, SUNDAY -> "weekend";
        };

        System.out.println("today is " + day + " and this is " + dayStat);

        Integer number = 5;

        String printedValue = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            default -> "out of range";
        };

        System.out.println(printedValue);

    }
}

enum Days {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}
