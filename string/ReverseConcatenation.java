
public class ReverseConcatenation {

    public static void main(String[] args) {
        String text = "Hello World";
        String newText = "";

        for (int n = text.length() - 1; n >= 0; --n) {
            String alphabet = Character.toString(text.charAt(n));
            newText = newText.concat(alphabet);
        }

        System.out.println(newText); // Output: dlroW olleH
    }

}
