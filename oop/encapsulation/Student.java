
class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid value");
        }
    }
}

public class Student {

    public static void main(String[] args) {
        Person student = new Person();

        student.setName("John Doe");
        student.setAge(25);

        System.out.println(student.getName()); // Output: John Doe
        System.out.println(student.getAge());  // Output: 25
    }
}
