
import java.util.StringTokenizer;

public class StringTokenizing {

    public static void main(String[] args) {

        String text = "Hello World! This is me.";

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
