
import java.io.*;

public class ReadString {

    public static void main(String[] args) throws IOException {
        String name;
        int age;

        // BufferedReader simplifies reading text from a character input stream by buffering characters,
        // making input more efficient. InputStreamReader bridges from byte streams (like System.in)
        // to character streams, which BufferedReader requires.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("What is your name: ");
            name = br.readLine();

            System.out.print("How old are you: ");
            age = Integer.parseInt(br.readLine());

            System.out.println("My name is " + name + ".");
            System.out.println("I am " + age + " years-old.");

            br.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

}
