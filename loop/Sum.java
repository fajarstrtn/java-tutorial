
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i = 1, sum = 0;

            System.out.print("Insert the number of loop: ");
            int loop = sc.nextInt();

            while (i <= loop) {
                sum += i;
                ++i;
            }

            System.out.println("Sum of iteration: " + sum + ".");
        }
    }

}
