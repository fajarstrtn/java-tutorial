
public class Cars {

    public static void main(String[] args) {
        // The size of an array gets defined.
        String[] cars = new String[5];

        cars[0] = "Mazda";
        cars[1] = "Honda";
        cars[2] = "Toyota";
        cars[3] = "Volkswagen";
        cars[4] = "Subaru";

        // Iterate an array using enhanced for-loop.
        for (String car : cars) {
            System.out.print(car.concat(" "));
        }

        System.out.println();
    }

}
