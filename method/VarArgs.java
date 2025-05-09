
public class VarArgs {

    private static void printAll(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        printAll("Hello! My name is John Martin".split(" "));
    }

}
