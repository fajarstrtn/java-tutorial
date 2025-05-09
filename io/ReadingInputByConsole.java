
public class ReadingInputByConsole {

    private static String readInputByConsole() {
        String name = System.console().readLine("Input your name: ");
        return "Hi, my name is " + name + ".";
    }

    public static void main(String[] args) {
        // You can execute this command: java ReadingInputByConsole.java.
        String result = readInputByConsole();
        System.out.println(result);
    }

}
