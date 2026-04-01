
import java.util.Arrays;
import java.util.List;

class Book {

    String name;
    Double price;

    public Book() {
    }

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

}

public class Utility {

    private static void generate() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(System.out::println);
    }

    private static void generate(String[] array) {
        List<String> list = Arrays.asList(array);
        list.stream().forEach(System.out::println);
    }

    private static void generate(Book[] array) {
        /*
         * When asList() method is used with primitive arrays,
         * it shows the memory reference of the array
         * instead of the list contents.
         * 
         * This happens because asList() method
         * returns a fixed-size list backed by the original array,
         * and for primitive types like int[],
         * it treats the array as an object, not as a list of values. */
        List<Book> list = Arrays.asList(array);
        list.stream().forEach(System.out::println);
    }

    private static void find(int[] array, int key) {
        Arrays.sort(array); // Output: 9, 11, 17, 21, 37, 50
        int index = Arrays.binarySearch(array, key);
        System.out.println(key + " is found at index " + index); // Output: 11 is found at index 1
    }

    private static void compare(int[] array1, int[] array2) {
        /*
         * Arrays.compare() method is used to compare two arrays lexicographically (like dictionary order).
         * It's available for all primitive types and object arrays, starting from Java 9.
         * 
         * How Arrays.compare() works:
         * 1. Returns 0 if both arrays are equal in size and content (element by element, in order).
         * 2. Returns a negative number if the first array is lexicographically
         * less than the second (e.g., [1, 2, 3] < [1, 2, 4]).
         * 3. Returns a positive number if the first array is lexicographically
         * greater than the second (e.g., [1, 2, 5] > [1, 2, 4]). */
        int difference = Arrays.compare(array1, array2);
        System.out.println("Difference: " + difference);
    }

    private static void fill(int[] array, int key) {
        Arrays.fill(array, key);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        generate();

        String[] fruits = {"Apple", "Grape", "Guava", "Orange"};
        generate(fruits);

        Book[] books = new Book[]{
            new Book("Java Programming Book", 100_000.50),
            new Book("Python Programming Book", 99_000.25)
        };
        generate(books);

        int[] number = {50, 9, 21, 11, 17, 37};
        int key = 11;
        find(number, key);

        var originalArray = new int[]{1, 2, 3, 4};
        var anotherArray = new int[]{1, 2, 4, 5};
        compare(originalArray, anotherArray);

        var prices = new int[]{10_000, 12_500, 13_000, 20_000};
        var fixPrice = 9999;
        fill(prices, fixPrice);
    }

}
