
import java.util.Scanner;

public class ReadStringWithScanner {

    public static void main(String[] args) {
        String name;
        int age;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What is your name: ");
            name = sc.nextLine();

            System.out.print("How old are you: ");
            age = sc.nextInt();

            System.out.println("My name is " + name + ".");
            System.out.println("I am " + age + " years-old.");
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            System.out.println("Program is successfully terminated.");
        }
    }

}
