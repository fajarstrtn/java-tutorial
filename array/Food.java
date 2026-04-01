
public class Food {

    private static final String[] foods = {"Pie", "Ramen", "Pizza", "Hamburger"};

    public static void main(String[] args) {
        int quantity = foods.length;

        for (int member = 0; member < quantity; ++member) {
            System.out.println(foods[member]);
        }
    }

}
