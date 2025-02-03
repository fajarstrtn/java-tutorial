
public class Store {

    public static void main(String[] args) {

        Payment payment = new PayPal();

/*      the result of the execution is "you are transfering $10.78 usd with paypal" */
        payment.send(10.78);

        payment = new Stripe();

/*      the result of the execution is "you are transfering $11.29 usd with stripe" */
        payment.send(11.29);

    }
}
