
public class StringManipulation {

    public static void main(String[] args) {

        byte[] byteArray = {71, 101, 101, 107, 115};

        String decodedByte = new String(byteArray);

        System.out.println(decodedByte);

        String cityName = "Amsterdam";

        System.out.println("Length of cityName is " + cityName.length());

        System.out.println("Char at 3rd position is " + cityName.charAt(2));

        System.out.println("Substring from 2nd position is " + cityName.substring(1));

        System.out.println("Substring start at 3rd position, then get 4 chars is " + cityName.substring(2, 4));

        System.out.println("Concat with \'city\' becomes " + cityName.concat(" city"));

        System.out.println("What is exactly index position of A? " + cityName.indexOf('A'));

        System.out.println("What is exactly last index position of am? " + cityName.lastIndexOf("am"));

        System.out.println("Is Amsterdam equal with AMSTERDAM in case-sensitive way? " + cityName.equals("AMSTERDAM"));

        System.out.println("Is Amsterdam equal with AMSTERDAM in incase-sensitive way?  " + cityName.equalsIgnoreCase("AMSTERDAM"));

        System.out.println("Compare Amsterdam with amsterdam lexicographically, then it becomes "
                + cityName.compareTo("amsterdam"));

        System.out.println("Compare with ignoring case between Amsterdam and amsterdam lexicographically, then it becomes "
                + cityName.compareToIgnoreCase("amsterdam"));

        System.out.println("Format Amsterdam to be in lowercase is " + cityName.toLowerCase());

        System.out.println("Format Amsterdam to be in upper case is " + cityName.toUpperCase());

        System.out.println("Trim this new string \'hello     \' and it becomes " + "hello     ".trim());

        System.out.println("Does Amsterdam contain ster? " + cityName.contains("ster"));

        System.out.println("Does Amsterdam start with \'Arm\'? " + cityName.startsWith("Arm"));

        System.out.println("Does Amsterdam ends with \'dam\'? " + cityName.endsWith("dam"));

    }
}
