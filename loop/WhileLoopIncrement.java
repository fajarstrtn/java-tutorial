
import java.util.Scanner;

public class WhileLoopIncrement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number of loops: ");
            int loop = sc.nextInt();

            int iteration = 0;

            while (iteration < loop) {
                System.out.println(iteration);
                ++iteration;
            }
        }
    }

}
