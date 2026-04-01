
import java.util.Scanner;

public class DecrementalLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int loop = sc.nextInt();

            int i = loop;
            do {
                System.out.println(i--);
            } while (i > 0);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated");
        }

    }

}
