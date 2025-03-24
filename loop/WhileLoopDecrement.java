
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoopDecrement {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Insert number of loops: ");
            int loop = Integer.parseInt(br.readLine());
            int iteration = loop;

            while (iteration > 0) {
                System.out.println(iteration);
                --iteration;
            }

            System.out.println("Total iteration: " + loop);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }

}
