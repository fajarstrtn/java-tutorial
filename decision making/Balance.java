
import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("insert price of an item: ");
            int priceOfAnItem = sc.nextInt();

            System.out.print("insert your balance: ");
            int myBalance = sc.nextInt();

            int result = myBalance - priceOfAnItem;

            if (result > 0) {
                System.out.println("your balance is " + result + " and you can continue buying items");
            } else if (result < 0) {
                System.out.println("sorry, you can\'t buy this item because of out of balance");
            } else {
                System.out.println("stop right there! your balance is " + result + " and you have nothing in your bank");
            }
        }

    }
}
