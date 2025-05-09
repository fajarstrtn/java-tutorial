
import java.util.*;

public class HasNextLine {

    public static void main(String[] args) {
        // Use StringBuilder to create a mutable (modifiable) sequence of characters.
        // The '\n' newline character is used to separate input into lines.
        // Without it, the Scanner would treat the entire input as a single line.
        String str = new StringBuilder()
                .append("\tArsenal\n")
                .append("     Barcelona         \n")
                .append("\t\t\tChelsea ")
                .append("Leverkusen       Manchester\n\n\tUnited")
                .toString();

        try (Scanner sc = new Scanner(str)) {
            int line = 0;

            while (sc.hasNextLine()) {
                System.out.println(String.format("%d | %s", ++line, sc.nextLine()));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
