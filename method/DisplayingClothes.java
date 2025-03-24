
import java.util.Arrays;

public class DisplayingClothes {

    public static void main(String[] args) {

        display();
        display("Shorts");
        display(new String[]{"Cap", "Trousers", "Sneakers"});

    }

    private static void display() {

        System.out.println("T-shirt");

    }

    private static void display(String clothes) {

        System.out.println("T-shirt and " + clothes);

    }

    private static void display(String[] outfit) {

        System.out.println(Arrays.toString(outfit).replaceAll("[\\[\\]]", "") + ", and T-shirt");

    }

}
