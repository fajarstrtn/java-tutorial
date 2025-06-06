
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int loop = sc.nextInt();

            for (var i = 1; i <= loop; ++i) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
