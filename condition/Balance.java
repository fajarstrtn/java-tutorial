
import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert price of an item: ");
            int priceOfAnItem = sc.nextInt();

            System.out.print("Insert your balance: ");
            int myBalance = sc.nextInt();

            // Subtract myBalance with priceOfAnItem and save to result variable.
            int result = myBalance - priceOfAnItem;

            if (result > 0) {
                System.out.println("Your balance is " + result + " and you can continue buying items.");
            } else if (result < 0) {
                System.out.println("Sorry, you cannot buy this item because of out of balance.");
            } else {
                System.out.println("Stop right there! Your balance is " + result + " and you have nothing in your bank.");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
