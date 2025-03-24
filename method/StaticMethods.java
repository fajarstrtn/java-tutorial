
public class StaticMethods {

    public static void print(String name) {

        System.out.println("Hello, " + name + "!");

    }

    public static void main(String[] args) {

        print("John Doe");
        StaticMethods.print("Justin");

    }

}
