
public class CarChecker {

    public static void main(String[] args) {
        String carName = "Renault";

        if (carName.equals("Renault")) {
            System.out.println("I\'m inside this car right now");
        }

        if (carName.equalsIgnoreCase("renault")) {
            System.out.println("I\'m really inside this car right now");
        }

        System.out.println("Outside the if-block scope");
    }

}
