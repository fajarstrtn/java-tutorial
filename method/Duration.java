
public class Duration {

    public static void main(String[] args) {

        getDurationString(3821);

    }

    private static void getDurationString(int seconds) {

        int toHours = seconds / 3600;
        int toMinutes = (seconds % 3600) / 60;
        int toSeconds = (seconds % 3600) % 60;

        System.out.println(toHours + "h " + toMinutes + "m " + toSeconds + "s");

    }
}
