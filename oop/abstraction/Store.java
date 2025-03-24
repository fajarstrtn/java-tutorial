
public class Store {

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
