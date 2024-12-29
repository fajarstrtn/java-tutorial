
import java.util.Arrays;

public class DisplayingClothes {

    public static void main(String[] args) {

        display();
        display("shorts");
        display(new String[]{"cap", "trousers", "sneakers"});

    }

    private static void display() {

        System.out.println("t-shirt");

    }

    private static void display(String clothes) {

        System.out.println("t-shirt and " + clothes);

    }

    private static void display(String[] outfit) {

        System.out.println(Arrays.toString(outfit).replaceAll("[\\[\\]]", "") + ", and t-shirt");

    }

}
