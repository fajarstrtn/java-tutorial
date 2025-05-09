
public class DefaultValue {

    public static void main(String[] args) {
        int[] ageOfemployees = new int[5];

        ageOfemployees[1] = 25;
        ageOfemployees[3] = 30;

        // Loop will iterate for how many elements should be displayed.
        for (int age : ageOfemployees) {
            System.out.println(age);
        }
    }

}
