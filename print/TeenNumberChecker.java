
public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {

        if (x >= 13 && x <= 19) {
            return true;
        } else if (y >= 13 && y <= 19) {
            return true;
        } else {
            return z >= 13 && z <= 19;
        }

    }

    public static boolean isTeen(int v) {

        return v >= 13 && v <= 19;

    }
}
