
public class ReadingInputByConsole {

    public static void main(String[] args) {

/*      user can execute command: java ReadingInputByConsole.java */
        String result = readInputByConsole();

        System.out.println(result);

    }

    private static String readInputByConsole() {

        String name = System.console().readLine("input your name: ");

        return "hi my name is " + name;

    }
}
