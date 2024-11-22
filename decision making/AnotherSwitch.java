
import java.util.Scanner;

public class AnotherSwitch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert a number: ");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                case 2:
                case 3:
                    System.out.println("first batch");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("second batch");
                    break;
                case 7:
                    System.out.println("third batch");
                case 8:
                    System.out.println("still third batch");
                case 9:
                    System.out.println("yet we are still third batch");
                    break;
                case 10:
                    System.out.println("fourth batch");
                    break;
                default:
                    System.out.println("out of batch");
            }
        }

    }
}
