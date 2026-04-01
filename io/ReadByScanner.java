
import java.util.Scanner;

public class ReadByScanner {

    private static String readByScanner() {
        String name;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input your name: ");
            name = input.nextLine();
        }
        return "Hi! My name is " + name;
    }

    public static void main(String[] args) {
        String result = readByScanner();
        System.out.println(result);
    }

}
