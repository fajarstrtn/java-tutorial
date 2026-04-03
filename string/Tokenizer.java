
import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        /*
         * StringTokenizer class breaks a string into tokens based on delimiters.
         * StringTokenizer is a legacy class, and the split method is preferred for modern applications.
         *
         * A StringTokenizer object internally maintains
         * a current position within the string to be tokenized.
         * Some operations advance this current position past the characters processed. */
        String text = "Lorem ipsum dolor sit amet";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        int total = tokenizer.countTokens();
        System.out.println("Before counting: " + total); // Output: Before counting: 5

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken()); // Output: Lorem ipsum dolor sit amet
        }

        total = tokenizer.countTokens();
        System.out.println("After counting: " + total); // Output: After counting: 0
    }

}
