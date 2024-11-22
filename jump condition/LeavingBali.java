
public class LeavingBali {

    public static void main(String[] args) {

        String[] cities = {"jakarta", "bandung", "jogjakarta", "bali", "semarang", "lombok"};

        for (String city : cities) {

/*          To jump out of for-loop statement. */
            if (city.equals("bali")) {
                break;
            }

            System.out.println(city);
        }
        
    }
}
