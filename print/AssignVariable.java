
public class AssignVariable {

    public static void main(String[] args) {

        String carName = "lamborghini";
        int horsePower;
        double price;

        price = 66_000.234;
        horsePower = 45_000;

        System.out.println("this is " + carName);
        System.out.println("it has " + horsePower + " horse power");
        System.out.println("it costs " + price + " usd");

        final String carColor = "yellow";
        System.out.println("this car has " + carColor + " color");

    }
}
