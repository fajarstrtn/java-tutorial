
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insert a number of loop: ");
            int loop = sc.nextInt();
            int i = 1, sum = 0;

            while (i <= loop) {
                sum += i;
                ++i;
            }

            System.out.println("Sum of iteration: " + sum);
        }

    }

}
