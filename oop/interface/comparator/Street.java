
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Street {

    private String name;

    public Street() {
    }

    public Street(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + name + ")";
    }

    public static void main(String[] args) {
        // List all of the street names in New York.
        List<Street> streets = Arrays.asList(
                new Street("Beekman Place"),
                new Street("Baxter Street"),
                new Street("Allen Street"),
                new Street("Ann Street"),
                new Street("Clinton Street"),
                new Street("Irving Place"),
                new Street("East Houston Street"),
                new Street("Lewis Avenue"),
                new Street("Fulton Street"),
                new Street("Bleecker Street")
        );

        // Sort the street names by name reversely.
        // For descending order just change the positions of s1 and s2 in the below compare method.
        Collections.sort(streets, new Comparator<Street>() {
            @Override
            public int compare(Street s1, Street s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });

        // Print the street names with method reference.
        streets.forEach(System.out::println);
    }

}
