
public class IdenticalVariables {

    private int age;

    public static void main(String[] args) {

        int age = 10;

        IdenticalVariables obj = new IdenticalVariables();

        System.out.println(age);
        System.out.println(obj.age);
        
    }
}
