
public class TernaryOperator {

    public static void main(String[] args) {
        String myCar = "Honda Civic Hatchback";
        System.out.println(myCar.equals("Honda Civic Hatchback")
                ? "Yes, this is mine" : "No, this isn\'t mine"); // Output: Yes, this is mine

        String yourCar = "FIAT 600 SUV";
        System.out.println(yourCar.equals("KIA Sorento SUV")
                ? "Yes, this is yours" : "No, this isn\'t yours"); // Output: No, this isn't yours
    }

}
