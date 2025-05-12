
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Beverage {

    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();

        // Tropical Drift is at index 0.
        menu.add("Tropical Drift");

        // It allows duplicate value.
        menu.add("Tropical Drift");

        // It can add Null values that depend on the implementation.
        menu.add(null);

        // If you don't specify the length of the array in the ArrayList constructor while creating the List object,
        // using add(int index, Object) for any index i will throw an exception if we have not specified the values
        // for 0 to i-1 index already.
        // 
        // If you try to add element at index 1 before adding elements at index 0
        // it will throw an error. It is always recommended to add elements in a particular index
        // only when the size is defined or to add them sequentially.
        menu.add(1, "Crimson Sunset");

        System.out.println(menu);

        // menu.set(10, "Velvet Mocha Chill"); will throw java.lang.IndexOutOfBoundsException.
        menu.set(1, "Velvet Mocha Chill");

        System.out.println(menu);

        // You can perform random access using index.
        System.out.println(menu.get(1));

        System.out.println("Index of \"Tropical Drift\" is " + menu.indexOf("Tropical Drift") + ".");

        // You can remove elements. But removing elements while iterating it is not a recommended option.
        menu.remove(null);
        menu.remove(2);

        System.out.println(menu);

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

        System.out.println(menu);

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

        System.out.println(menu);

        // Adding 3 new beverages on the menu.
        menu.add("Frappuccino");
        menu.add("Iced Mocha");
        menu.add("Mocha");

        System.out.println(menu);

        // This method is used to simply remove an object from the List.
        // If there are multiple such objects, then the first occurrence of the object is removed.
        menu.remove("Mocha");

        // This method takes an integer value which simply removes the element present at that specific index in the List.
        // After removing the element, all the elements are moved to the left to fill the space
        // and the indices of the objects are updated.
        menu.remove(7);

        // Accessing elements using get() method.
        String beverage = menu.get(1);

        // This method takes a single parameter, the object to be checked if it is present in the list.
        // This method returns true if the specified element is present in the list, otherwise, it returns false.
        boolean hasCappuccino = menu.contains("Cappuccino");

        System.out.println("Is Cappuccino is on the menu? " + hasCappuccino + ".");

        System.out.println("I want to order " + beverage + ".");

        List<String> myOrder = new ArrayList<>(Arrays.asList("Iced Long Black", "Tropical Drift", "Affogato"));

        boolean isMyOrder = menu.containsAll(myOrder);

        System.out.println("Excuse me, is " + myOrder + " on the menu? " + isMyOrder + ".");

        myOrder.add(null);
        isMyOrder = menu.containsAll(myOrder);

        System.out.println("Please, is " + myOrder + " on the menu? " + isMyOrder + ".");

        try {
            myOrder = null;
            isMyOrder = menu.containsAll(myOrder);
            System.out.println("Once again, is " + myOrder + " on the menu? " + isMyOrder + ".");
        } catch (NullPointerException npe) {
            System.err.println("Error! List is null.");
        }

        System.out.println("Final result: " + menu);
    }

}
