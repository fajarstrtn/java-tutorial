
public class FruitMarket {

    public static void main(String[] args) {

        /* Without instanceof it's too risky downcasting. If user changes new Mango() with new BluebBerry()
        then it throws an ClassCastException where class BlueBerry cannot be cast to class Mango
        at line 12. And at line 9, it is an upcasting.*/
        Mango mango = new Mango();
        Fruit fruit = mango;

        if (fruit != null) {
            /* Risky downcasting, possibly throws an exception. */
            Mango mango1 = (Mango) fruit;
            mango1.setName("mango");
            mango1.setShape("oval");
            mango1.inform();
        }

        /* Use instanceof for safe upcasting/downcasting. */
        if (fruit instanceof Mango mango2) {
            mango2.setName("tommy atkins mango");
            mango2.setShape("rounded");
            mango2.inform();
        } else if (fruit instanceof BlueBerry bb1) {
            bb1.setName("blueberry");
            bb1.setSour(true);
            bb1.inform();
        } else {
            System.out.println("instance is not found");
        }

    }

}
