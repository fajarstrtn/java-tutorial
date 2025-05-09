
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your payment: ");
        double payment = sc.nextDouble();

        sc.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        System.out.println(us);

        Locale localeIndia = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        String india = NumberFormat.getCurrencyInstance(localeIndia).format(payment);
        System.out.println(india);
    }

}
