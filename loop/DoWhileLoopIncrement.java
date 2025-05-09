
import java.util.Scanner;

public class DoWhileLoopIncrement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int loop = sc.nextInt();

            int iteration = 0;

            do {
                System.out.println(++iteration);
            } while (iteration < loop);

            System.out.println("Iteration value is " + iteration + ".");
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
