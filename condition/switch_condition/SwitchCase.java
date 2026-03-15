
public class SwitchCase {

    private static void print(int number) {
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

    public static void main(String[] args) {
        print(0);    // Output: Zero
        print(1);    // Output: One
        print(7);    // Output: Seven
        print(-100); // Output: Other
        print(99);   // Output: Other
    }

}
