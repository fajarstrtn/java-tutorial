
public class SkipTheNumber {

    public static void main(String[] args) {
        int i = 0;
        int loop = 20;

        do {
            if (i == 4 || i == 32 || i == 50) {
                i += 2;
                continue;
            }
            System.out.println(i);
            i += 2;
        } while (i <= loop);
    }

}
