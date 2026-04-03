
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitSelector {

    public static void main(String[] args) throws IOException {
        String fruit;
        int num = 0;

        try (var br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("What is your favorite fruit: ");
            fruit = br.readLine();

            if (fruit.equals("Mango")) {
                System.out.println("I give you " + fruit);
                System.out.println("You got " + (++num) + " fruit");
            } else {
                System.out.println("Sorry, I don\'t have it");
                System.out.println("You got " + (num) + " fruit");
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

}
