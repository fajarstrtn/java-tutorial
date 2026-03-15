
import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        /*
         * StringTokenizer class in Java is used to break a string
         * into tokens based on delimiters.
         * 
         * A StringTokenizer object internally maintains a current position
         * within the string to be tokenized.
         * Some operations advance this current position past the characters processed.
         * 
         * StringTokenizer is a legacy class,
         * and the split method is preferred for modern applications. */
        String text = "Lorem ipsum dolor sit amet";
        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");
        int total = stringTokenizer.countTokens();

        System.out.println("Total before counting: " + total); // Output: Total before counting: 5

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken()); // Output: Lorem ipsum dolor sit amet
        }

        total = stringTokenizer.countTokens();

        System.out.println("Total after counting: " + total); // Output: Total after counting: 0
    }

}
