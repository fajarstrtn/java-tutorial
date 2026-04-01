
public class DefaultValue {

    public static void main(String[] args) {
        var ageOfEmployees = new int[5];

        ageOfEmployees[1] = 25;

        for (int age : ageOfEmployees) {
            System.out.println(age); // Output: 0 25 0 0 0
        }
    }

}
