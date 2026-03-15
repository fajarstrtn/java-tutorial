
public class TernaryOperator {

    public static void main(String[] args) {
        boolean isGood = true;
        String answer = isGood ? "This is a good car" : "No, this is a bad car";

        System.out.println(answer); // Output: This is a good car

        String myCar = "Honda Jazz";
        String yourCar = "Tesla Model S";

        System.out.println(myCar.equals(yourCar));  // Output: false
        System.out.println(!myCar.equals(yourCar)); // Output: true
    }

}
