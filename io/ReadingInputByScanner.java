
import java.util.Scanner;

public class ReadingInputByScanner {

    public static void main(String[] args) {

        String result = readInputByScanner();
        System.out.println(result);

    }

    private static String readInputByScanner() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        input.close();
        return "Hi, my name is " + name;

    }

}
