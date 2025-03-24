
import java.io.*;

public class ReadString {

    public static void main(String[] args) throws IOException {

        /* BufferedReader simplifies reading text from a character input stream.
        It buffers the characters in order to enable efficient reading of text data.
        InputStreamReader is a function that converts the input stream of bytes
        into a stream of characters so that it can be read as BufferedReader
        expects a stream of characters. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int age;

        try {
            System.out.print("What is your name: ");
            name = br.readLine();

            System.out.print("How old are you: ");
            age = Integer.parseInt(br.readLine());

            System.out.println("My name is " + name);
            System.out.println("I am " + age + " years-old");
            br.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }

}
