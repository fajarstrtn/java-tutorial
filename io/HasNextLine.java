
import java.util.*;

public class HasNextLine {

    public static void main(String[] args) {

        /* Use string builder to create a mutable, or in other words, a modifiable succession of characters.
        This '\n' character will separate tokens, else it will generate a whole string. */
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
