
abstract class Payment {

    public abstract void send(String destination, double amount);

    public abstract void withdraw(String source, double amount);

}

class PayPal extends Payment {

    @Override
    public void send(String destination, double amount) {
        System.out.println("You transfer $" + amount + " USD to " + destination + " through Paypal");
    }

    @Override
    public void withdraw(String source, double amount) {
        System.out.println("You withdraw $" + amount + " USD from " + source + " through Paypal");
    }

}

class Stripe extends Payment {

    @Override
    public void send(String destination, double amount) {
        System.out.println("You transfer $" + amount + " USD to " + destination + " through Stripe");
    }

    @Override
    public void withdraw(String source, double amount) {
        System.out.println("You withdraw $" + amount + " USD from " + source + " through Stripe");
    }

}

public class Transaction {

    public static void main(String[] args) {
        Payment payment;

        payment = new PayPal();
        payment.send("5201238891", 6.80);
        payment.withdraw("Mobile Banking", 2.10);

        payment = new Stripe();
        payment.send("4429879120", 110.75);
        payment.withdraw("ATM", 50.15);
    }

}
