
public class Cat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 32));  // Output: true
        System.out.println(isCatPlaying(true, 44));  // Output: true
        System.out.println(isCatPlaying(false, 25)); // Output: true
        System.out.println(isCatPlaying(false, 21)); // Output: false
    }

}
