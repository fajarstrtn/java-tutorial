
import java.util.Scanner;

public class FindingMaximumNumber {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert 1st number: ");
            int firstNumber = sc.nextInt();

            System.out.print("insert 2nd number: ");
            int secondNumber = sc.nextInt();

            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " is higher than " + secondNumber);
            } else if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " is lower than " + secondNumber);
            } else {
                System.out.println("both are equal");
            }
        }

    }
}