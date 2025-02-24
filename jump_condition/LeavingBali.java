
public class LeavingBali {

    public static void main(String[] args) {

        String[] cities = {"Jakarta", "Bandung", "Jogjakarta", "Bali", "Semarang", "Lombok"};

        for (String city : cities) {

/*          To jump out of for-loop statement. */
            if (city.equals("Bali")) {
                break;
            }

            System.out.println(city);
        }
        
    }
}
