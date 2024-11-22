
public class Food {

    private static final String[] foods = {"pie", "ramen", "pizza", "hamburger"};

    public static void main(String[] args) {

        int size = foods.length;

        for (int member = 0; member < size; ++member) {
            System.out.println(foods[member]);
        }
        
    }
}
