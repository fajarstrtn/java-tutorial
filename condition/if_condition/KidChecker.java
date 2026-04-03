
import java.util.Scanner;

public class KidChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your age: ");
        int number = sc.nextInt();

        if (number <= 17) {
            System.out.println("Underage");
        }

        System.out.println("Outside the if-block scope");

        sc.close();
    }

}
