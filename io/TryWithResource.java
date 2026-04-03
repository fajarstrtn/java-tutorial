
import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input your name: ");
            String name = sc.nextLine();

            System.out.print("Input your age: ");
            int age = sc.nextInt();

            System.out.println(name);
            System.out.println(age);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated");
        }
    }

}
