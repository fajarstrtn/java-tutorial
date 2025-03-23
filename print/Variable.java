
public class Variable {

    public static String role = "Back-End Developer";

    public static void main(String[] args) {

        String name = "Jack";
        System.out.println("My name is " + name);

        label:
        {
            int age = 26;
            System.out.println("I am " + age + " years-old");
        }

        System.out.println("i work as a " + Variable.role);

        Employee jack = new Employee();
        jack.setHobby("Writing code");
        System.out.println(name + " likes to " + jack.getHobby());

    }
}

class Employee {

    private String hobby;

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return this.hobby;
    }

}
