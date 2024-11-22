
import java.util.*;

public class HasNextLine {

    public static void main(String[] args) {

/*      Use string builder to create a mutable, or in other words, a modifiable succession of characters.
        this '\n' character will separate tokens, else it will generate a whole string. */
        String str = new StringBuilder()
                .append("\tarsenal\n")
                .append("     barcelona         \n")
                .append("\t\t\tchelsea ")
                .append("leverkusen       ")
                .toString();

        try (Scanner sc = new Scanner(str)) {

            int line = 0;
            
            while (sc.hasNextLine()) {
                System.out.println(String.format("%d | %s", ++line, sc.nextLine()));
            }
        }

    }
}
