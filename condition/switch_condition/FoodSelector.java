
public class FoodSelector {

    public static void main(String[] args) {
        int selector = 4;

        switch (selector) {
            case 1 ->
                System.out.println("Hamburger");
            case 2 ->
                System.out.println("Pizza");
            case 3 ->
                System.out.println("Chicken Wings");
            default ->
                System.out.println("Invalid value");
        }
    }

}
