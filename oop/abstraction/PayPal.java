
public class PayPal extends Payment {

    @Override
    public void send(String destination, double amount) {
        System.out.println("You transfered $" + amount + " USD to " + destination + " with Paypal");
    }

    @Override
    public void withdraw(String source, double amount) {
        System.out.println("You withdraw $" + amount + " USD from " + source + " with Paypal");
    }

}
