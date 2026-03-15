
import java.util.Scanner;

public class NumberInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number: ");
        int num = sc.nextInt();

        sc.close();

        switch (num) {
            case 1 ->
                System.out.println("I\'m the one");
            case 2 ->
                System.out.println("I\'m the second");
            case 3 ->
                System.out.println("I\'m the third");
            default ->
                System.out.println("I\'m the other");
        }
    }

}
