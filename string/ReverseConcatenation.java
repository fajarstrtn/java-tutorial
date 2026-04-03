
public class ReverseConcatenation {

    public static void main(String[] args) {
        String text = "Hello World";
        String container = "";

        for (int n = text.length() - 1; n >= 0; --n) {
            String alphabet = Character.toString(text.charAt(n));
            container = container.concat(alphabet);
        }

        System.out.println(container); // Output: dlroW olleH
    }

}
