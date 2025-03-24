
public class PlayingCat {

    public static void main(String[] args) {

        System.out.println("Is cat playing? " + isCatPlaying(true, 26));
        System.out.println("Is cat playing? " + isCatPlaying(true, 46));
        System.out.println("Is cat playing? " + isCatPlaying(false, 27));
        System.out.println("Is cat playing? " + isCatPlaying(false, 24));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }

    }

}
