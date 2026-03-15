
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Insert the last number: ");
            int secondNumber = sc.nextInt();

            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " is higher than " + secondNumber);
            } else if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " is lower than " + secondNumber);
            } else {
                System.out.println("Both are equal");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated");
        }
    }

}
