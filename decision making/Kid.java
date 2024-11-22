
import java.util.Scanner;

public class Kid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("insert a number: ");
        int number = sc.nextInt();

        if (number <= 17) {
            System.out.println("you are a kid");
        }

        System.out.println("outside of if block");

    }
}
