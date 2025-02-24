
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BloodDonation {

    public static void main(String[] args) throws IOException {

        byte age;
        float weight;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Insert age : ");
            age = Byte.parseByte(br.readLine());
            System.out.print("Insert weight : ");
            weight = Float.parseFloat(br.readLine());

            if (age < 17) {
                System.out.println("You are not allowed to donate blood");
            }

            if (Math.round(weight) <= 50) {
                System.out.println("Sorry, you are at least more or less 50kg to donate blood");
            }

            System.out.println("You are allowed to donate blood");

        } catch (IOException ioe) {

            System.err.println(ioe.getMessage());

        }

    }
}
