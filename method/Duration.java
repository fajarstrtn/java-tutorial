
public class Duration {

    private static boolean isValid(int minutes, int seconds) {
        return minutes >= 0 && seconds >= 0;
    }

    private static boolean isValid(int seconds) {
        return seconds >= 0;
    }

    private static void getDurationInString(int seconds) {
        if (isValid(seconds)) {
            int toHours = seconds / 3600;
            int toMinutes = (seconds % 3600) / 60;
            int toSeconds = (seconds % 3600) % 60;
            System.out.println(toHours + "h " + toMinutes + "m " + toSeconds + "s");
        } else {
            System.err.println("Invalid value");
        }
    }

    private static void getDurationInString(int minutes, int seconds) {
        if (isValid(minutes, seconds)) {
            int toSeconds = (minutes * 60) + seconds;
            getDurationInString(toSeconds);
        } else {
            System.err.println("Invalid value");
        }
    }

    public static void main(String[] args) {
        getDurationInString(3821);    // Output: 1h 3m 41s
        getDurationInString(0);       // Output: 0h 0m 0s
        getDurationInString(-100);    // Output: Invalid value
        getDurationInString(5, 1000); // Output: 0h 21m 40s
        getDurationInString(0, 0);    // Output: 0h 0m 0s
        getDurationInString(-1, -20); // Output: Invalid value
    }

}
