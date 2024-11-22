
public class GuardClauses {

    public static void main(String[] args) {

        String name = "Fajar Satriatna";
        byte age = 26;

/*      Guard clause help to filter the condition before reaching the happy flow.
        This strategy will put the bad condition on the top of the happy flow. */
        if (!name.equals("Fajar Satriatna")) {
            System.out.println("This is not Fajar Satriatna.");
            return;
        }

        if (age != 26) {
            System.out.println("Maybe this is another Fajar Satriatna.");
            return;
        }

        System.out.println("This is Fajar Satriatna.");
    }
}
