
import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert an alphabet: ");
            char alphabet = sc.next().charAt(0);

            switch (alphabet) {
                case 'A', 'a' ->
                    System.out.println("this is " + alphabet);
                case 'B', 'b' ->
                    System.out.println("this is " + alphabet);
                default ->
                    System.out.println("out of choice");
            }
        }
        
    }
}
