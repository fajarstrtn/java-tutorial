
import java.util.*;

public class HasNextTokens {

    public static void main(String[] args) {

        String str = new StringBuilder()
                .append("arsenal:\tchelsea:\nliverpool:")
                .append("\nbayern:\n\n\n\ninter:\t         ")
                .append("         benfica:milan:leverkusen\t\tbarca:")
                .append("madrid\t\t\t\tmu\n\t\t")
                .toString();

        try (Scanner sc = new Scanner(str)) {

            int line = 0;

            while (sc.hasNext()) {

                String val = sc.next();

                /*              The ':|\\s+' is a regular expression matching a single colon
                or more whitespace characters. */
                if ("inter:".equals(val)) {
                    sc.useDelimiter(":|\\s+");
                }

                System.out.println(String.format("%d | %s", ++line, val));
            }
        }

    }
}
