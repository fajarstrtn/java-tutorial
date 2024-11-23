
public class AssignVariable {

    public static void main(String[] args) {

        String carName = "Lamborghini";
        int horsePower;
        double price;

        price = 66_000.234;
        horsePower = 45_000;

        System.out.println("This is " + carName);
        System.out.println("It has " + horsePower + " horse power");
        System.out.println("It costs " + price + " usd");

        final String carColor = "Yellow";
        System.out.println("This car has " + carColor + " color");

    }
}
