
import java.util.List;
import java.util.Vector;
import java.util.ListIterator;

public class Zodiac {

    public static void main(String[] args) {
        // The Vector class in Java implements a growable array of objects.
        // Vectors were legacy classes, but now it is fully compatible with collections.
        // It comes under java.util package and implement the List interface.
        // 
        // In Java, the Vector class is a part of the Java Collections Framework and provides a dynamic array implementation of the List interface.
        // Note that the Vector class is synchronized, meaning that multiple threads can access the same vector without causing problems.
        // However, this synchronization comes at the cost of performance, so if you don't need to share a vector between multiple threads, it's generally better to use an alternative class like ArrayList which is not synchronized.
        // 
        // It expands as elements are added.
        // Vector class is synchronized in nature means it is thread-safe by default.
        // Like an ArrayList, it maintains insertion order.
        // It creates a default vector of the initial capacity is 10.
        List<String> vector = new Vector<>();

        // Adding an element at the end of the Vector.
        vector.add("Aries");
        vector.add("Taurus");
        vector.add("Leo");
        vector.add("Virgo");
        vector.add("Libra");
        vector.add("Scorpio");
        vector.add("Sagittarius");
        vector.add("Aquarius");
        vector.add("Pisces");

        System.out.println("First occurence of the Vector: " + vector);

        // It allows duplicates and nulls.
        vector.add("Aries");
        vector.add(null);

        System.out.println("Second occurence of the Vector: " + vector);

        // Adding an element at a specific index in the Vector.
        vector.add(1, "Cancer");

        System.out.println("Third occurence of the Vector: " + vector);

        // This method takes an index and the updated element to be inserted at that index.
        vector.set(4, "Gemini");

        System.out.println("Fourth occurence of the list: " + vector);

        // Removing an object from the Vector. If there are multiple such objects, then the first occurrence of the object is removed.
        vector.remove(null);

        // Vector is indexed, so this method takes an integer value which simply removes the element present at that specific index in the Vector.
        // After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
        vector.remove(0);

        System.out.println("Fifth occurence of the list: " + vector);

        // Counting size of the Vector.
        for (var i = 0; i < vector.size(); ++i) {
            // Retrieving an element of the Vector.
            System.out.println("Iterating with for-loop: " + vector.get(i));
        }

        for (var zodiac : vector) {
            System.out.println("Iterating with enhanced for-loop: " + zodiac);
        }

        ListIterator<String> listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            String zodiac = listIterator.next();
            System.out.println("Iterating with ListIterator: " + zodiac);
        }

        // Removing the first element of the Vector.
        vector.removeFirst();

        // Removing the last element of the Vector.
        vector.removeLast();

        System.out.println("Sixth occurence of the list: " + vector);

        // Checking whether a specific element is present in the Vector or not.
        boolean containsGemini = vector.contains("Gemini");

        System.out.println("Is Gemini available in the Vector? " + containsGemini + ".");

        // Checking and finding the occurrence of a particular element in the vector.
        // If the element is present then the index of the first occurrence of the element is returned otherwise -1 is returned if the vector does not contain the element.
        int indexOfLeo = vector.indexOf("Leo");

        System.out.println("You can find Leo at index " + indexOfLeo);

        // Checking whether the Vector is empty or not.
        boolean isEmpty = vector.isEmpty();

        System.out.println("Is Vector empty? " + isEmpty + ".");
    }

}
