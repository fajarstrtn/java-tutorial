
public class GuardClauses {

    public static void main(String[] args) {
        String name = "John Doe";
        byte age = 26;

        // Guard clauses are used to exit early from a method when invalid or undesirable conditions are met.
        // This keeps the "happy path" (expected flow) clean and avoids deep nesting.
        if (!name.equalsIgnoreCase("John Doe")) {
            System.out.println("This is not " + name);
            return;
        }

        if (age != 26) {
            System.out.println("Maybe this is another " + name);
            return;
        }

        // Happy path: All conditions are satisfied
        System.out.println("This is " + name);
    }

}
