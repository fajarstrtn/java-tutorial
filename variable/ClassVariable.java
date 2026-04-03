
public class ClassVariable {

    public static String fullName = "John Doe";
    public String nickName;
    public byte age;

    public void changeFullName() {
        fullName = "Jane Doe";
    }

    public void changeFullName(String fullName) {
        ClassVariable.fullName = fullName;
    }

    public static void display() {
        /*
         * Uncomment this will cause an error
         * "non-static variable nickName cannot be referenced from a static context".
         * 
         * Syntax:
         * System.out.println(nickName); */
        System.out.println(fullName);
    }

    public static void main(String[] args) {
        ClassVariable.display(); // Output: John Doe

        var person = new ClassVariable();
        person.changeFullName();
        System.out.println(ClassVariable.fullName); //Output: Jane Doe

        person.changeFullName("John Doe");
        System.out.println(ClassVariable.fullName); //Output: John Doe
    }

}
