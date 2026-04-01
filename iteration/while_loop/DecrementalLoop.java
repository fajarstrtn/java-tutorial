
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecrementalLoop {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Insert the number: ");
            int loop = Integer.parseInt(br.readLine());

            int i = loop;
            while (i > 0) {
                System.out.println(i);
                --i;
            }

            System.out.println(loop);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

}
