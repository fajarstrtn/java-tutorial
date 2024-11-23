
import java.util.Scanner;

public class DoWhileLoopIncrement {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert a number: ");
            int loop = sc.nextInt();
            int iteration = 0;

            do {
                System.out.println(++iteration);
            } while (iteration < loop);

            System.out.println("Iteration value is " + iteration);
        }
        
    }
}
