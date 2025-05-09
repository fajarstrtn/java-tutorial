
import java.util.Scanner;

public class ReadingInputByScanner {

    private static String readInputByScanner() {
        String name;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input your name: ");
            name = input.nextLine();
        }

        return "Hi, my name is " + name + ".";
    }

    public static void main(String[] args) {
        String result = readInputByScanner();
        System.out.println(result);
    }

}
