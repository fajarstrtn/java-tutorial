
public class IdenticalVariables {

    private int age;

    public static void main(String[] args) {

        IdenticalVariables obj = new IdenticalVariables();
        int age = 10;

        System.out.println(obj.age);
        System.out.println(age);

    }
}
