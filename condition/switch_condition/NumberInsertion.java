
import java.util.Scanner;

public class NumberInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number: ");
        int num = sc.nextInt();

        sc.close();

        switch (num) {
            case 1 ->
                System.out.println("One");
            case 2 ->
                System.out.println("Two");
            case 3 ->
                System.out.println("Three");
            default ->
                System.out.println("Invalid value");
        }
    }

}
