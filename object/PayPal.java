
public class PayPal extends Payment {

    @Override
    public void send(double amount) {
        System.out.println("you are transfering $" + amount + " usd with paypal");
    }

}
