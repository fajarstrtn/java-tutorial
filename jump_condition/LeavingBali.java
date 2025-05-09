
public class LeavingBali {

    public static void main(String[] args) {
        String[] cities = {"Jakarta", "Bandung", "Yogjakarta", "Bali", "Semarang", "Lombok"};

        for (var city : cities) {
            // To jump out of for-loop statement.
            if (city.equals("Bali")) {
                break;
            }

            System.out.println(city);
        }
    }

}
