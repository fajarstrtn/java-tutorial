
import java.util.Scanner;

public class ReadStringWithScanner {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String name;
            int age;

            System.out.print("What is your name: ");
            name = sc.nextLine();
            System.out.print("How old are you: ");
            age = sc.nextInt();

            System.out.println("My name is " + name);
            System.out.println("I am " + age + " years-old");
            
        }
    }
}
