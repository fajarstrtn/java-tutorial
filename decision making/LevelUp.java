
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LevelUp {

    public static void main(String[] args) throws IOException {

        int num = 0;
        String fruit;

        try (var br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("what is your favourite fruit: ");
            fruit = br.readLine();

            if (fruit.equals("mango")) {
                System.out.println("we give you " + fruit);
                System.out.println("you got " + ++num + " fruit");
            } else {
                System.out.println("sorry, we don\'t have it");
                System.out.println("you got " + num + " fruit");
            }

        } catch (IOException ioe) {

            System.err.println(ioe.getMessage());

        }

    }
}
