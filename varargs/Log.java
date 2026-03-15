
public class Log {

    /*
    * A method can have variable length parameters with other parameters too,
    * but one should ensure that there exists only one varargs parameter
    * that should be written last in the parameter list of the method declaration.
    * 
    * Specifying varargs as the first parameter of the method instead of
    * the last one will throw an error.
    * 
    * Syntax:
    * public void print(int... expenses, String id) {} */
    public void print(String id, int... expenses) {
        System.out.println(id);
        for (int expense : expenses) {
            System.out.println(expense);
        }
    }

    /*
    * Specifying two varargs in a single method will cause an error.
    *
    * Syntax:
    * public void print(String... ids, int... expenses) {} */
    public void print(int... expenses) {
        for (int expense : expenses) {
            System.out.println(expense);
        }
    }

    public static void main(String[] args) {
        var log = new Log();
        log.print("ABC01234", 25_000, 10_000, 30_000, 12_500); // Output: ABC01234 25000 10000 30000 12500
        log.print(100, 200, 300, 400, 500);                    // Output: 100 200 300 400 500
    }

}
