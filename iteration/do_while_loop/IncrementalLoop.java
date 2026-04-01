
import java.util.Scanner;

public class IncrementalLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int loop = sc.nextInt();

            int i = 0;
            do {
                System.out.println(++i);
            } while (i < loop);

            System.out.println(i);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated");
        }
    }

}
