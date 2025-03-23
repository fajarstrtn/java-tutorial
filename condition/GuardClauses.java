
public class GuardClauses {

    public static void main(String[] args) {

        String name = "John Doe";
        byte age = 26;

        /* Guard clause help to filter the condition before reaching the happy flow.
        This strategy will put the bad condition on the top of the happy flow. */
        if (!name.equalsIgnoreCase("John Doe")) {
            System.out.println("This is not " + name);
            return;
        }

        if (age != 26) {
            System.out.println("Maybe this is another " + name);
            return;
        }

        System.out.println("This is " + name);

    }

}
