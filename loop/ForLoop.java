
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("insert a number: ");
            int loop = sc.nextInt();

            for (int i = 1; i <= loop; ++i) {
                System.out.println(i);
            }
        }
        
    }
}
