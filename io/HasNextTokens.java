
import java.util.Scanner;

public class HasNextTokens {

    public static void main(String[] args) {
        String str = new StringBuilder()
                .append("Manchester_United:\tChelsea:\tArsenal:\n")
                .append("Manchester_City:\n\n\n\nAston_Villa:\t         Liverpool:\n")
                .append("Everton:\n\tBrentford:\n")
                .append("Leeds_United:\t\t\t\tWest_Ham_United:\n\t\t")
                .toString();

        try (Scanner sc = new Scanner(str).useDelimiter(":|\\s+")) {
            int i = 0;
            while (sc.hasNext()) {
                String value = sc.next();
                if (!value.isEmpty()) {
                    System.out.println(++i + " | " + value);
                }
            }
        }
        System.out.println("Program is successfully terminated");
    }
}
