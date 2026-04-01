
public class ReadByConsole {

    private static String readByConsole() {
        String name = System.console().readLine("Input your name: ");
        return "Hi, my name is " + name;
    }

    public static void main(String[] args) {
        String result = readByConsole();
        System.out.println(result);
    }

}
