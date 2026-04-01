
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadByBufferedReader {

    public static void main(String[] args) throws IOException {
        /*
* BufferedReader simplifies reading text from a character input stream
* by buffering characters, making input more efficient.
* 
* InputStreamReader bridges from byte streams (like System.in)
* to character streams, which BufferedReader requires. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Input your name: ");
            String name = br.readLine();

            System.out.print("Input your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.println(name);
            System.out.println(age);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            br.close();
        }
    }

}
