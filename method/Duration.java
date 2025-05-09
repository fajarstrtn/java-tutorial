
public class Duration {

    private static boolean isValid(int minutes, int seconds) {
        return minutes >= 0 && seconds >= 0;
    }

    private static boolean isValid(int seconds) {
        return seconds >= 0;
    }

    private static void getDurationString(int seconds) {
        if (isValid(seconds)) {
            int toHours = seconds / 3600;
            int toMinutes = (seconds % 3600) / 60;
            int toSeconds = (seconds % 3600) % 60;
            System.out.println(toHours + "h " + toMinutes + "m " + toSeconds + "s");
        } else {
            System.err.println("Input is out of range.");
        }
    }

    private static void getDurationString(int minutes, int seconds) {
        if (isValid(minutes, seconds)) {
            int toSeconds = (minutes * 60) + seconds;
            getDurationString(toSeconds);
        } else {
            System.err.println("Input is out of range.");
        }
    }

    public static void main(String[] args) {
        getDurationString(3821);
        getDurationString(0);
        getDurationString(-100);
        getDurationString(5, 1000);
        getDurationString(0, 0);
        getDurationString(-1, -20);
    }

}
