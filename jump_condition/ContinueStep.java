
public class ContinueStep {

    public static void main(String[] args) {

        int iteration = 1, loop = 10;

        while (iteration <= loop) {

            if (iteration == 5 || iteration == 9) {
                ++iteration;
                continue;
            }

            /* This code below will not be executed after continue. */
            System.out.println(iteration);
            ++iteration;
        }

    }

}
