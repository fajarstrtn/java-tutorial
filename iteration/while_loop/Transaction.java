
import java.util.Scanner;

public class Transaction {

    private static int getHomePage(Scanner sc) {
        System.out.println("1. Buy credit");
        System.out.println("2. Buy internet quota");
        System.out.println("3. Buy netflix");
        System.out.println("4. Exit");
        System.out.print("Insert choice: ");
        return sc.nextInt();
    }

    private static int getCreditPage(Scanner sc, int balance) {
        System.out.println("1. Buy $1 credit");
        System.out.println("2. Buy $10 credit");
        System.out.println("3. Buy $100 credit");
        System.out.println("0. Back");
        System.out.print("Insert choice: ");
        int option = sc.nextInt();

        if (option == 0) {
            return balance;
        }

        int credit = switch (option) {
            case 1 ->
                1;
            case 2 ->
                10;
            case 3 ->
                100;
            default -> {
                getErrorMessage();
                yield balance;
            }
        };

        System.out.println("Are you sure you want to buy $" + credit + " credit?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int confirmation = sc.nextInt();

        if (confirmation == 1 && balance >= credit) {
            balance -= credit;
            System.out.println("Transaction succeeded;Check your balance");
        } else if (confirmation != 1) {
            System.out.println("Transaction canceled");
        } else {
            System.out.println("Out of balance");
        }

        return balance;
    }

    private static int getInternetQuotaPage(Scanner sc, int balance) {
        System.out.println("1. Buy 1GB internet quota for $1");
        System.out.println("2. Buy 10GB internet quota for $10");
        System.out.println("3. Buy 100GB internet quota for $100");
        System.out.println("0. Back");
        System.out.print("Insert choice: ");
        int option = sc.nextInt();

        if (option == 0) {
            return balance;
        }

        int credit = switch (option) {
            case 1 ->
                1;
            case 2 ->
                10;
            case 3 ->
                100;
            default -> {
                getErrorMessage();
                yield balance;
            }
        };

        System.out.println("Are you sure you want to buy " + credit + "GB quota?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int confirmation = sc.nextInt();

        if (confirmation == 1 && balance >= credit) {
            balance -= credit;
            System.out.println("Transaction succeeded;Check your balance");
        } else if (confirmation != 1) {
            System.out.println("Transaction canceled");
        } else {
            System.out.println("Out of balance");
        }

        return balance;
    }

    private static int getNetflixPage(Scanner sc, int balance) {
        System.out.println("1. Buy netflix $9/month");
        System.out.println("2. Buy netflix $16/2 months");
        System.out.println("3. Buy netflix $100/year");
        System.out.println("0. Back");
        System.out.print("Insert choice: ");
        int option = sc.nextInt();

        if (option == 0) {
            return balance;
        }

        int credit = switch (option) {
            case 1 ->
                9;
            case 2 ->
                16;
            case 3 ->
                100;
            default -> {
                getErrorMessage();
                yield balance;
            }
        };

        System.out.println("Are you sure you want to buy netflix for $" + credit + "?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int confirmation = sc.nextInt();

        if (confirmation == 1 && balance >= credit) {
            balance -= credit;
            System.out.println("Transaction succeeded;Check your balance");
        } else if (confirmation != 1) {
            System.out.println("Transaction canceled");
        } else {
            System.out.println("Out of balance");
        }

        return balance;
    }

    private static void getErrorMessage() {
        System.out.println("Wrong option! Please try again");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;

        boolean iteration = true;
        while (iteration) {
            System.out.println("Balance: " + balance);
            int option = getHomePage(sc);

            switch (option) {
                case 1 ->
                    balance = getCreditPage(sc, balance);
                case 2 ->
                    balance = getInternetQuotaPage(sc, balance);
                case 3 ->
                    balance = getNetflixPage(sc, balance);
                case 4 ->
                    iteration = false;
                default ->
                    getErrorMessage();
            }
        }

        System.out.println("Thank you for using the service");
    }
}
