
import java.util.Scanner;

public class Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number: ");
        int number = sc.nextInt();

        if (number <= 17) {
            System.out.println("You are a kid.");
        }

        System.out.println("Outside of if block.");
    }

}
