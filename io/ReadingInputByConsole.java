
public class ReadingInputByConsole {

    public static void main(String[] args) {

        /* User can execute command: java ReadingInputByConsole.java */
        String result = readInputByConsole();
        System.out.println(result);

    }

    private static String readInputByConsole() {

        String name = System.console().readLine("Input your name: ");
        return "Hi, my name is " + name;

    }

}
