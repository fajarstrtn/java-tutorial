
public class SwitchCase {

    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(9);
        printNumberInWord(-100);
        printNumberInWord(100);

    }

    private static void printNumberInWord(int number) {

        String word = switch (number) {
            case 0 ->
                "Zero";
            case 1 ->
                "One";
            case 2 ->
                "Two";
            case 3 ->
                "Three";
            case 4 ->
                "Four";
            case 5 ->
                "Five";
            case 6 ->
                "Six";
            case 7 ->
                "Seven";
            case 8 ->
                "Eight";
            case 9 ->
                "Nine";
            default ->
                "Other";
        };

        System.out.println(word);

    }

}
