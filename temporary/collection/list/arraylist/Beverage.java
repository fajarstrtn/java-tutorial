
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Beverage {

    public static void main(String[] args) {
        // The List Interface in Java extends the Collection Interface and is a part of the java.util package.
        // It is used to store the ordered collections of elements.
        // In a Java List, you can organize and manage the data sequentially.
        // List is an interface, objects cannot be created of the type list.
        // You always need a class that implements this List in order to create an object.
        // List is an interface, implemented by the ArrayList class, pre-defined in java.util package. 
        List<String> menu = new ArrayList<>();

        // This method is used to add an element at the end of the list.
        // Now, Tropical Drift is at index 0.
        menu.add("Tropical Drift");

        // List allows duplicate elements.
        menu.add("Tropical Drift");

        // It can add null values that depend on the implementation.
        menu.add(null);

        // If you don't specify the length of the array in the ArrayList constructor while creating the List object,
        // using add(int index, Object) for any index i will throw an exception if you have not specified the values
        // for 0 to i-1 index already.
        // 
        // If you try to add element at index 1 before adding elements at index 0
        // it will throw an error. It is always recommended to add elements in a particular index
        // only when the size is defined or to add them sequentially.
        // 
        // This method is used to add an element at a specific index in the list.
        menu.add(1, "Crimson Sunset");

        System.out.println("First occurence of list: " + menu);

        // This method takes an index and the updated element which needs to be inserted at that index.
        // This menu.set(10, "Velvet Mocha Chill"); will throw java.lang.IndexOutOfBoundsException.
        menu.set(1, "Velvet Mocha Chill");

        System.out.println("Second occurence of list: " + menu);

        // You can perform random access using index.
        System.out.println(menu.get(1));

        // It returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
        System.out.println("Index of \"Tropical Drift\" is " + menu.indexOf("Tropical Drift") + ".");

        // This method is used to simply remove an object from the List.
        // If there are multiple such objects, then the first occurrence of the object is removed.
        // You can remove elements. But removing elements while iterating it is not a recommended option.
        menu.remove(null);

        // This method takes an integer value which simply removes the element present at that specific index in the list.
        // After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
        menu.remove(2);

        System.out.println("Third occurence of list: " + menu);

        if (menu.contains("Velvet Mocha Chill")) {
            System.out.println("Yes, it is in the house now!");
        }

        menu.add("Iced Long Black");
        menu.add("Mocha");
        menu.add("Mocha");
        menu.add("Swiss Latte");
        menu.add("Cappuccino");
        menu.add("Caramel Macchiato ");
        menu.add("Mocha");
        menu.add(3, "Affogato");

        System.out.println("Fourth occurence of list: " + menu);

        // You can use indexOf() to find the first occurrence of an element in the list.
        int index = menu.indexOf("Mocha");
        System.out.println("Index of Mocha is " + index + ".");

        // Also, you can use lastIndexOf() to find the last occurrence of an element in the list.
        index = menu.lastIndexOf("Mocha");
        System.out.println("Last index of Mocha is " + index + ".");

        ListIterator<String> listIterator = menu.listIterator();

        while (listIterator.hasNext()) {
            String beverage = listIterator.next();
            if (beverage.equalsIgnoreCase("mocha")) {
                listIterator.remove();
            }
        }

        System.out.println("Fifth occurence of list: " + menu);

        // Adding 3 new beverages on the menu.
        menu.add("Frappuccino");
        menu.add("Iced Mocha");
        menu.add("Mocha");

        System.out.println("Sixth occurence of list: " + menu);

        // This method is used to simply remove an object from the List.
        // If there are multiple such objects, then the first occurrence of the object is removed.
        menu.remove("Mocha");

        // This method takes an integer value which simply removes the element present at that specific index in the List.
        // After removing the element, all the elements are moved to the left to fill the space
        // and the indices of the objects are updated.
        menu.remove(7);

        // This method returns the element at the specified index in the list.
        // Accessing elements using get() method.
        String beverage = menu.get(1);
        System.out.println("I want to order " + beverage + ".");

        // This method takes a single parameter, the object to be checked if it is present in the list.
        // This method returns true if the specified element is present in the list, otherwise, it returns false.
        boolean hasCappuccino = menu.contains("Cappuccino");
        System.out.println("Is Cappuccino is on the menu? " + hasCappuccino + ".");

        List<String> myOrder = new ArrayList<>(Arrays.asList("Iced Long Black", "Tropical Drift", "Affogato"));

        // The containsAll() method of List interface in Java is used to check if this List contains all of the elements in the specified Collection.
        // So basically it is used to check if a List contains a set of elements or not.
        // The method returns true if all elements in the collection col are present in the List otherwise it returns false.
        boolean containsAllMyOrder = menu.containsAll(myOrder);
        System.out.println("Excuse me, is " + myOrder + " on the menu? " + containsAllMyOrder + ".");

        myOrder.add(null);
        containsAllMyOrder = menu.containsAll(myOrder);
        System.out.println("Please, is " + myOrder + " on the menu? " + containsAllMyOrder + ".");

        try {
            myOrder = null;
            containsAllMyOrder = menu.containsAll(myOrder);
            System.out.println("Once again, is " + myOrder + " on the menu? " + containsAllMyOrder + ".");
        } catch (NullPointerException npe) {
            System.err.println("Error! List is null.");
        }

        // Sorting list in alphabetical order.
        List<String> sortedMenu = menu.stream().sorted().toList();
        System.out.println("Sorted menu: " + sortedMenu);

        // Counting size of list.
        int size = menu.size();
        System.out.println("Size before cleaning up list: " + size + ".");
        System.out.println("Final result before cleaning up list: " + menu);

        // Cleaning up the list.
        menu.clear();

        size = menu.size();
        System.out.println("Size after cleaning up list: " + size + ".");
        System.out.println("Final result after cleaning up list: " + menu);

        // It returns true if list is empty.
        boolean isEmpty = menu.isEmpty();
        System.out.println("Is menu empty? " + isEmpty + ".");

        List<String> hisCoffee = new ArrayList<>(Arrays.asList("Honey Latte", "Pandan Lattle", "Piccolo"));
        List<String> herCoffee = new ArrayList<>(Arrays.asList("Honey Latte", "Pandan Lattle", "Piccolo"));

        // This equals method is used to compare two lists.
        // It compares the lists as, both lists should have the same size, and
        // all corresponding pairs of elements in the two lists are equal.
        // This function has a single parameter which is object to be compared for equality.
        // This method returns true if lists are equal.
        boolean isEquals = hisCoffee.equals(herCoffee);
        System.out.println("Are these two lists equal? " + isEquals + ".");
    }

}
