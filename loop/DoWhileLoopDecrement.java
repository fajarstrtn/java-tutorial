
import java.util.Scanner;

public class DoWhileLoopDecrement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Put a number on it: ");
            int loop = sc.nextInt();

            int iteration = loop;

            do {
                System.out.println(iteration--);
            } while (iteration > 0);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }

    }

}
