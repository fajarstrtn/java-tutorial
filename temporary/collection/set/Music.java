
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Music {

    public static void main(String[] args) {
        // The Set Interface is present in java.util package and extends the Collection interface.
        // Set does not maintain any specific order of elements (Exceptions: LinkedHashSet and TreeSet).
        // The order of elements in HashSet is not guaranteed, so the elements will be displayed in a random order if any are added.
        // Since Set is an interface, objects cannot be created of the typeset. you always need a class that extends this list in order to create an object.
        Set<String> genre = new HashSet<>();

        // Adding a specific element to the set.
        // The function adds the element only if the specified element is not already present in the set else the function returns false if the element is already present in the Set.
        // It is an unordered collection of objects in which duplicate values cannot be stored.
        genre.add("Pop");
        genre.add("Rock");
        genre.add("Hip Hop");
        genre.add("Jazz");
        genre.add("Blues");

        // Adding duplicate value and null to the set.
        // In the below example, you can see the elements are in random order as HashSet does not maintain any order
        // and duplicate elements are automatically ignored in HashSet.
        // Most Set implementations allow a single null element.
        genre.add("Blues");
        genre.add(null);
        genre.add(null);

        System.out.println("First occurence of the set: " + genre);

        // Adding the element only if the specified element is not already present in the set
        // else the function returns false if the element is already present in the Set. 
        boolean isNew = genre.add("Jazz");
        System.out.println("Is Jazz new? " + isNew + ".");

        // The function returns true if the element is not present in the set and is new,
        // else it returns false if the element is already present in the set.
        isNew = genre.add("Classical");
        System.out.println("Is Classical new? " + isNew + ".");

        System.out.println("Second occurence of the set: " + genre);

        Set<String> myGenre = new HashSet<>(
                Arrays.asList("EDM", "Reggae", "Country")
        );

        // Adding all the elements of a specified collection to the current collection.
        // The elements are added randomly without following any specific order.
        // This method returns true if the element were added successfully, otherwise returns false.
        boolean isAddedAll = genre.addAll(myGenre);
        System.out.println("Is myGenre added successfully to genre? " + isAddedAll + ".");

        System.out.println("Third occurence of the set: " + genre);

        List<String> herGenre = new ArrayList<>(
                Arrays.asList("Funk", "Soul", "Metal")
        );

        // Adding elements from ArrayList to HashSet.
        genre.addAll(herGenre);

        System.out.println("Fourth occurence of the set: " + genre);

        // Checking whether a specific element is present in the Set or not.
        // So basically it is used to check if a Set contains any particular element.
        // The method returns true if the element is present in the set else return false.
        boolean containsRock = genre.contains("Rock");
        System.out.println("Is Rock in the genre? " + containsRock + ".");

        Set<String> niceGenreToHave = new HashSet<>(
                Arrays.asList("Pop", "Rock", "Blues")
        );

        // Checking if a collection contains all the elements of a specified collection.
        // This method returns true if the set contains all the elements and returns false if any of the elements are missing.
        boolean containsSpecificGenre = genre.containsAll(niceGenreToHave);
        System.out.println("Are Pop, Rock, and Blues in the genre? " + containsSpecificGenre + ".");

        // Removing a particular element from a Set.
        // This method returns true if the specified element is present in the Set otherwise it returns false.
        boolean deletedGenre = genre.remove("Pop");
        System.out.println("Is Pop successfully removed? " + deletedGenre + ".");

        System.out.println("Fifth occurence of the set: " + genre);

        Set<String> genreToBeDeleted = new HashSet<>(
                Arrays.asList("Blues", "Reggae", "EDM")
        );

        // This method is used to remove all the elements from the collection which are present in the set.
        // This method returns true if this set changed as a result of the call.
        boolean isAllGenreDeleted = genre.removeAll(genreToBeDeleted);
        System.out.println("Are Blues, Reggae, and EDM deleted from the set? " + isAllGenreDeleted + ".");

        System.out.println("Sixth occurence of the set: " + genre);

        Set<String> retainedGenre = new HashSet<>(
                Arrays.asList("Rock", "Metal", "Funk", "Country", "Classical", "Punk", "Disco", "Gospel", "Folk")
        );

        // Retaining only the elements in a collection that are also present in another collection.
        // It modifies the current collection by removing elements that are not in the specified collection.
        // This method returns true if the current collection was modified by retaining common elements otherwise return false.
        boolean isGenreRetained = genre.retainAll(retainedGenre);
        System.out.println("Is genre retained? " + isGenreRetained + ".");
        System.out.println("Retained genre: " + genre); // [Rock, Metal, Funk, Country, Classical]

        System.out.println("Seventh occurence of the set: " + genre); // [Rock, Metal, Funk, Country, Classical]

        Set<String> anotherRetainedGenre = new HashSet<>(
                Arrays.asList("Rock", "Metal", "Funk", "Country", "Classical")
        );

        // No genre is retained.
        isGenreRetained = genre.retainAll(anotherRetainedGenre);
        System.out.println("Is another genre retained? " + isGenreRetained + ".");
        System.out.println("Retained genre: " + genre);

        System.out.println("Eighth occurence of the set: " + genre);

        try {
            genre.retainAll(null);
            System.out.println("Retained genre: " + genre);
        } catch (NullPointerException npe) {
            System.err.println("Error: " + npe.toString());
        }

        Iterator<String> iterator = genre.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Iterating over iterator: " + element);
        }

        int size = genre.size();
        System.out.println("Size of the set before clearing the set is " + size + ".");

        // Removing all the elements from the set but not delete the set.
        // The reference for the set still exists.
        genre.clear();
        size = genre.size();
        System.out.println("Size of the set after clearing the set is " + size + ".");

        // Checking whether the set is empty or not.
        boolean isEmpty = genre.isEmpty();
        System.out.println("Is genre empty? " + isEmpty + ".");
    }

}
