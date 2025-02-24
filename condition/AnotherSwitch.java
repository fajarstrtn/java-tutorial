
import java.util.Scanner;

public class AnotherSwitch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insert a number: ");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                case 2:
                case 3:
                    System.out.println("First batch");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Second batch");
                    break;
                case 7:
                    System.out.println("Third batch");
                case 8:
                    System.out.println("Still third batch");
                case 9:
                    System.out.println("Yet we are still third batch");
                    break;
                case 10:
                    System.out.println("Fourth batch");
                    break;
                default:
                    System.out.println("Out of batch");
            }
        }

    }
}
