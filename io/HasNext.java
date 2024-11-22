
import java.util.*;

public class HasNext {

    public static void main(String[] args) {

        String str = "1 2 3 4 5 hello";

        try (Scanner sc = new Scanner(str)) {

            int line = 0;

/*          It checks every token inside of sc object, separates with white space. */
            while (sc.hasNext()) {

                System.out.print(String.format("%d | %b\t", ++line, sc.hasNextInt()));
                System.out.println(sc.next());
            }
        }
        
    }
}
