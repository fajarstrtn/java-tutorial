
public class InstanceVariable {

    /*
     * This is an instance variable.
     * It has default value since it is not initialized. */
    String name;
    byte age;

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();

        System.out.println(obj.name); // Output: null
        System.out.println(obj.age);  // Output: 0

        // This is a local variable.
        String name = "John Doe";
        byte age = 22;

        System.out.println(name); // Output: John Doe
        System.out.println(age);  // Output: 22
    }

}
