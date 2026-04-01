
import java.util.Scanner;

public class IncrementalLoop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the number: ");
            int loop = sc.nextInt();

            int i = 0;
            while (i < loop) {
                System.out.println(i);
                ++i;
            }
        }
    }

}
