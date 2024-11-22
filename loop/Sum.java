
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert a number of loop: ");
            int loop = sc.nextInt();

            int i = 1;
            int sum = 0;

            while (i <= loop) {
                sum += i;
                ++i;
            }

            System.out.println("sum of iteration: " + sum);
        }
        
    }
}
