
public class NoNumber5th {

    public static void main(String[] args) {
        int i;
        i = 1;

        // Minimum of execution is 0.
        while (i <= 10) {
            if (i == 5) {
                ++i;
                continue;
            }

            System.out.println(i);
            ++i;
        }

        i = 1;

        // Minimum of execution is 1.
        do {
            if (i == 5) {
                ++i;
                continue;
            }

            System.out.println(i);
            ++i;
        } while (i <= 10);

        for (i = 1; i <= 10; ++i) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

}
