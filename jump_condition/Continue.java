
public class Continue {

    public static void main(String[] args) {
        int i = 1;
        int loop = 10;

        while (i <= loop) {
            if (i == 5 || i == 9) {
                ++i;
                continue;
            }

            // This line of code below will not be executed after the continue keyword.
            System.out.println(i);
            ++i;
        }
    }

}
