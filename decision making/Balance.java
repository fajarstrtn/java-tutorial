
import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Insert price of an item: ");
            int priceOfAnItem = sc.nextInt();

            System.out.print("Insert your balance: ");
            int myBalance = sc.nextInt();

            int result = myBalance - priceOfAnItem;

            if (result > 0) {
                System.out.println("Your balance is " + result + " and you can continue buying items");
            } else if (result < 0) {
                System.out.println("Sorry, you can\'t buy this item because of out of balance");
            } else {
                System.out.println("Stop right there! your balance is " + result + " and you have nothing in your bank");
            }
        }

    }
}
