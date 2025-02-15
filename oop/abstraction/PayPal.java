
public class PayPal extends Payment {

    @Override
    public void send(String destination, double amount) {
        System.out.println("you transfered $" + amount + " usd to " + destination + " with paypal");
    }

    @Override
    public void withdraw(String source, double amount) {
        System.out.println("you withdraw $" + amount + " usd from " + source + " with paypal");
    }

}
