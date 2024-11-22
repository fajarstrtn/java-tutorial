
import java.util.Scanner;

public class CellPhoneOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0, balance = 1;
        boolean iteration = true;

        do {
            switch (option) {
                case 0 -> {
                    System.out.println("balance : " + balance);
                    option = getHomePage(sc);
                }
                case 1 -> {
                    balance = getCreditPage(sc, balance);
                    option = 0;
                }
                case 2 -> {
                    balance = getInternetQuotaPage(sc, balance);
                    option = 0;
                }
                case 3 -> {
                    balance = getNetflixPage(sc, balance);
                    option = 0;
                }
                case 4 ->
                    iteration = false;
                default -> {
                    getErrorMessage();
                    option = 0;
                }
            }
        } while (iteration);

    }

    private static int getHomePage(Scanner sc) {

        System.out.println("1. buy credit");
        System.out.println("2. buy internet quota");
        System.out.println("3. buy netflix");
        System.out.println("4. exit");
        System.out.print("insert choice: ");
        int option = sc.nextInt();

        return option;

    }

    private static int getCreditPage(Scanner sc, int balance) {

        System.out.println("1. buy $1 credit");
        System.out.println("2. buy $10 credit");
        System.out.println("3. buy $100 credit");
        System.out.println("0. back");
        System.out.print("insert choice: ");
        int option = sc.nextInt();

        if (option > 3) {
            getErrorMessage();
            return balance;
        }

        switch (option) {
            case 1 ->
                balance = getCreditPage(sc, balance, "$1");
            case 2 ->
                balance = getCreditPage(sc, balance, "$10");
            case 3 ->
                balance = getCreditPage(sc, balance, "$100");
        }

        return balance;

    }

    private static int getCreditPage(Scanner sc, int balance, String tag) {

        System.out.println("are you sure for buying " + tag + " credit?");
        System.out.println("1. yes");
        System.out.println("2. no");
        System.out.print("insert choice: ");
        int option = sc.nextInt();
        int credit;

        if (option > 2) {
            getErrorMessage();
            return balance;
        }

        credit = switch (tag) {
            case "$1" ->
                1;
            case "$10" ->
                10;
            default ->
                100;
        };

        if (!(balance >= credit)) {
            System.out.println("out of balance");
            return balance;
        }

        if (option == 1) {
            balance -= credit;
            System.out.println("transaction succeed. check your balance.");
        }

        return balance;

    }

    private static int getInternetQuotaPage(Scanner sc, int balance) {

        System.out.println("1. buy 1gb internet quota for $1");
        System.out.println("2. buy 10gb internet quota for $10");
        System.out.println("3. buy 100gb internet quota for $100");
        System.out.println("0. back");
        System.out.print("insert choice: ");
        int option = sc.nextInt();

        if (option > 3) {
            getErrorMessage();
            return balance;
        }

        switch (option) {
            case 1 ->
                balance = getInternetQuotaPage(sc, balance, "1gb");
            case 2 ->
                balance = getInternetQuotaPage(sc, balance, "10gb");
            case 3 ->
                balance = getInternetQuotaPage(sc, balance, "100gb");
        }

        return balance;

    }

    private static int getInternetQuotaPage(Scanner sc, int balance, String tag) {

        System.out.println("are you sure for buying " + tag + " internet quota?");
        System.out.println("1. yes");
        System.out.println("2. no");
        System.out.print("insert choice: ");
        int option = sc.nextInt();
        int credit;

        if (option > 2) {
            getErrorMessage();
            return balance;
        }

        credit = switch (tag) {
            case "1gb" ->
                1;
            case "10gb" ->
                10;
            default ->
                100;
        };

        if (!(balance >= credit)) {
            System.out.println("out of balance");
            return balance;
        }

        if (option == 1) {
            balance -= credit;
            System.out.println("transaction succeed. check your balance.");
        }

        return balance;

    }

    private static int getNetflixPage(Scanner sc, int balance) {

        System.out.println("1. buy netflix $9/month");
        System.out.println("2. buy netflix $16/2 months");
        System.out.println("3. buy netflix $100/year");
        System.out.println("0. back");
        System.out.print("insert choice: ");
        int option = sc.nextInt();

        if (option > 3) {
            getErrorMessage();
            return balance;
        }

        switch (option) {
            case 1 ->
                balance = getNetflixPage(sc, balance, "$9/month");
            case 2 ->
                balance = getNetflixPage(sc, balance, "$16/2 months");
            case 3 ->
                balance = getNetflixPage(sc, balance, "$100/year");
        }

        return balance;

    }

    private static int getNetflixPage(Scanner sc, int balance, String tag) {

        System.out.println("are you sure for buying netflix" + tag + "?");
        System.out.println("1. yes");
        System.out.println("2. no");
        System.out.print("insert choice: ");
        int option = sc.nextInt();
        int credit;

        if (option > 2) {
            getErrorMessage();
            return balance;
        }

        credit = switch (tag) {
            case "$9/month" ->
                9;
            case "$16/2 months" ->
                16;
            default ->
                100;
        };

        if (!(balance >= credit)) {
            System.out.println("out of balance");
            return balance;
        }

        if (option == 1) {
            balance -= credit;
            System.out.println("transaction succeed. check your balance.");
        }

        return balance;

    }

    private static void getErrorMessage() {

        System.out.println("wrong option! back to home page.");
        
    }
}
