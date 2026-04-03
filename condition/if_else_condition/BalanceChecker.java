
import java.util.Scanner;

public class BalanceChecker {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert the price: ");
            int price = sc.nextInt();

            System.out.print("Insert your balance: ");
            int balance = sc.nextInt();

            // Subtract balance with price and save to result variable.
            int result = balance - price;

            if (result > 0) {
                System.out.println("Your balance is " + result + " and you can continue buying items");
            } else if (result < 0) {
                System.out.println("Sorry, you cannot buy this item because of out of balance");
            } else {
                System.out.println("Your balance is " + result + " and you have nothing in your bank");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated");
        }
    }

}
