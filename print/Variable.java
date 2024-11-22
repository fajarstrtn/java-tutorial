
public class Variable {

    public static String role = "developer";

    public static void main(String[] args) {

        String name = "fajar";
        System.out.println("my name is " + name);

        label:
        {
            int age = 26;
            System.out.println("my age is " + age);
        }

        System.out.println("i work as a " + Variable.role);

        Employee fajar = new Employee();
        fajar.setHobby("coding");

        System.out.println("fajar\'s hobby is " + fajar.getHobby());
        
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
