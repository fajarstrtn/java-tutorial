
import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert an alphabet: ");
            char alphabet = sc.next().charAt(0);

            switch (alphabet) {
                case 'A', 'a' ->
                    System.out.println("This is " + alphabet + ".");
                case 'B', 'b' ->
                    System.out.println("This is " + alphabet + ".");
                default ->
                    System.out.println("Out of choice.");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
