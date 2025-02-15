
public class Stripe extends Payment {

    @Override
    public void send(String destination, double amount) {
        System.out.println("you transfered $" + amount + " usd to " + destination + " with stripe");
    }

    @Override
    public void withdraw(String source, double amount) {
        System.out.println("you withdraw $" + amount + " usd from " + source + " with stripe"); 
    }

}
