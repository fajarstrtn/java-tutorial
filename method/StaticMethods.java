public class StaticMethods {

    public static void print(String name) {

        System.out.println ("hello, " + name + "!");

    }

    public static void main(String[] args) {

        print("john doe");
        StaticMethods.print("blake");
        
    }
}