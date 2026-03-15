
class Employee {

    private String hobby;

    public Employee() {
    }

    public Employee(String hobby) {
        this.hobby = hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return this.hobby;
    }

}

public class Variable {

    public static String role = "Back-End Developer";

    public static void main(String[] args) {
        String name = "John Doe";

        System.out.println("My name is " + name);           // Output: My name is John Doe
        System.out.println("I work as a " + Variable.role); // Output: I work as a Back-End Developer

        label:
        {
            int age = 26;

            System.out.println("I am " + age + " years-old"); // Output: I am 26 years-old
        }

        var jack = new Employee();
        jack.setHobby("playing soccer");

        System.out.println(name + " likes to " + jack.getHobby()); // Output: John Doe likes to playing soccer

        // The final variable is immutable.
        final int salary = 2_000_000;

        System.out.println("My salary is " + salary); // Output: My salary is 2000000
    }

}
