
public class StaticMethod {

    public static void print(String name) {
        System.out.println("Hi, " + name + "!");
    }

    public static void main(String[] args) {
        print("John Doe");              // Output: Hi, John Doe!
        StaticMethod.print("Jane Doe"); // Output: Hi, Jane Doe!
    }

}
