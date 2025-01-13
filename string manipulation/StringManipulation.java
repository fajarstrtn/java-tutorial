
public class StringManipulation {

    public static void main(String[] args) {

        byte[] byteArray = {71, 101, 101, 107, 115};

        String decodedByte = new String(byteArray);

        System.out.println(decodedByte);

        String cityName = "amsterdam";

        System.out.println("length of cityName is " + cityName.length());

        System.out.println("char at 3rd position is " + cityName.charAt(2));

        System.out.println("substring from 2nd position is " + cityName.substring(1));

        System.out.println("substring start at 3rd position, then get 4 chars is " + cityName.substring(2, 4));

        System.out.println("concat with \'city\' becomes " + cityName.concat(" city"));

        System.out.println("what is exactly index position of A? " + cityName.indexOf('A'));

        System.out.println("what is exactly last index position of am? " + cityName.lastIndexOf("am"));

        System.out.println("is Amsterdam equal with AMSTERDAM in case-sensitive way? " + cityName.equals("AMSTERDAM"));

        System.out.println("is Amsterdam equal with AMSTERDAM in incase-sensitive way?  " + cityName.equalsIgnoreCase("AMSTERDAM"));

        System.out.println("compare Amsterdam with amsterdam lexicographically, then it becomes "
                + cityName.compareTo("amsterdam"));

        System.out.println("compare with ignoring case between Amsterdam and amsterdam lexicographically, then it becomes "
                + cityName.compareToIgnoreCase("amsterdam"));

        System.out.println("format Amsterdam to be in lowercase is " + cityName.toLowerCase());

        System.out.println("format Amsterdam to be in upper case is " + cityName.toUpperCase());

        System.out.println("trim this new string \'hello     \' and it becomes " + "hello     ".trim());

        System.out.println("does Amsterdam contain ster? " + cityName.contains("ster"));

        System.out.println("does Amsterdam start with \'Arm\'? " + cityName.startsWith("Arm"));

        System.out.println("does Amsterdam ends with \'dam\'? " + cityName.endsWith("dam"));

        String emptyString = "";

        String whiteSpacesString = "       ";

        System.out.println("is the 1st string empty? " + emptyString.isEmpty());

        System.out.println("is the 1st string blank? " + emptyString.isBlank());

        System.out.println("is the 2nd string empty? " + whiteSpacesString.isEmpty());

        System.out.println("is the 2nd string blank? " + whiteSpacesString.isBlank());

    }
}
