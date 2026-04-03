
public class Manipulation {

    public static void main(String[] args) {
        String cityName = "Amsterdam";
        String postCode = "1011";

        System.out.println(cityName.length());                         // Output: 9
        System.out.println(cityName.charAt(2));                        // Output: s
        System.out.println(cityName.substring(1));                     // Output: msterdam
        System.out.println(cityName.substring(2, 4));                  // Output: st
        System.out.println(cityName.concat(" city"));                  // Output: Amsterdam city
        System.out.println(cityName.indexOf('A'));                     // Output: 0
        System.out.println(cityName.lastIndexOf("am"));                // Output: 7
        System.out.println(cityName.equals("AMSTERDAM"));              // Output: false
        System.out.println(cityName.equalsIgnoreCase("AMSTERDAM"));    // Output: true
        System.out.println(cityName.compareTo("amsterdam"));           // Output: -32
        System.out.println(cityName.compareToIgnoreCase("amsterdam")); // Output: 0
        System.out.println(cityName.toLowerCase());                    // Output: amsterdam
        System.out.println(cityName.toUpperCase());                    // Output: AMSTERDAM
        System.out.println(cityName.contains("ster"));                 // Output: true
        System.out.println(cityName.startsWith("Arm"));                // Output: false
        System.out.println(cityName.endsWith("dam"));                  // Output: true
        System.out.println(cityName.replace('A', 'O'));                // Output: Omsterdam
        System.out.println(String.valueOf(postCode));                  // Output: 1011

        String empty = "";
        String whiteSpaces = "       ";
        String spacyWord = "Hello...          ";

        System.out.println(empty.isEmpty());       // Output: true
        System.out.println(empty.isBlank());       // Output: true
        System.out.println(whiteSpaces.isEmpty()); // Output: false
        System.out.println(whiteSpaces.isBlank()); // Output: true
        System.out.println(spacyWord.trim());      // Output: Hello...

        String text
                = "Amsterdam is the capital and largest city of the Netherlands,"
                + " known for its elaborate canal system,"
                + " rich cultural heritage, and vibrant, liberal atmosphere.";
        var words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        byte[] byteArray = {71, 101, 101, 107, 115};
        String decodedString = new String(byteArray);
        System.out.println(decodedString); // Output: Geeks
    }

}
