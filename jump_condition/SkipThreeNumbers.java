
public class SkipThreeNumbers {

    public static void main(String[] args) {

        int iteration = 0, loop = 20;

        do {
            if (iteration == 4 || iteration == 32 || iteration == 50) {
                iteration += 2;
                continue;
            }

            System.out.println(iteration);
            iteration += 2;
        } while (iteration <= loop);

    }

}
