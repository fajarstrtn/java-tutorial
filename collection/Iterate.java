
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterate {

    public static void main(String[] args) {
        // You are using Arrays.asList(...), which returns a fixed-size list.
        // Calling iterator.remove() on it will throw a java.lang.UnsupportedOperationException.
        // List<String> list = Arrays.asList("Americano", "Spanish Latte", "Mocha", "Macchiato", "Cold Brew");
        // 
        // Try this:
        List<String> list;

        list = new ArrayList<>(
                Arrays.asList(
                        "Americano",
                        "Spanish Latte",
                        "Mocha",
                        "Macchiato",
                        "Cold Brew"
                )
        );

        for (var coffee : list) {
            System.out.println(coffee);
        }

        separate();

        // | Feature                  | For-each Loop | Iterator                            |
        // | ------------------------ | ------------- | ----------------------------------- |
        // | Read elements            | ✅ Yes         | ✅ Yes                             |
        // | Remove elements safely   | ❌ No          | ✅ Yes (using `iterator.remove()`) |
        // | Simple syntax            | ✅ Yes         | ❌ No (more verbose)               |
        // | Thread-safe modification | ❌ No          | ✅ Safer (to some extent)          |
        list.forEach(System.out::println);

        separate();

        // In Java, an Iterator is an object used to traverse (iterate through) elements in a collection (like List, Set, etc.).
        // It's part of the java.util package and provides a safe way to loop through a collection while optionally allowing modification during iteration (e.g., removing elements).
        // It avoids ConcurrentModificationException when removing elements during iteration.
        // Works uniformly across various types of collections.
        Iterator<String> iterator;

        iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() <= 5) {
                iterator.remove();
            }
        }

        System.out.println(list);

        separate();

        // ListIterator is only available for List implementations (like ArrayList, LinkedList).
        // It supports Bidirectional traversal (hasPrevious(), previous()) and Element modification (set(), add(), remove()).
        ListIterator<String> listIterator;

        listIterator = list.listIterator();

        // | Feature                  | Iterator   | ListIterator      | Stream                       |
        // | ------------------------ | ---------- | ----------------- | ---------------------------- |
        // | Traverse Forward         | ✅ Yes      | ✅ Yes             | ✅ Yes (via terminal ops) |
        // | Traverse Backward        | ❌ No       | ✅ Yes             | ❌ No                     |
        // | Remove Elements          | ✅ Yes      | ✅ Yes             | ❌ No                     |
        // | Modify Elements          | ❌ No       | ✅ Yes             | ✅ Yes (via `.map()`)     |
        // | Functional Style         | ❌ No       | ❌ No              | ✅ Yes                    |
        // | Supports all Collections | ✅ Yes      | ❌ No (only Lists) | ✅ Yes                    |
        while (listIterator.hasNext()) {
            String coffee = listIterator.next();

            if (coffee.equalsIgnoreCase("Americano")) {
                listIterator.remove();
            }

            if (coffee.equalsIgnoreCase("Macchiato")) {
                listIterator.set("Caramel Macchiato");
            }
        }

        System.out.println(list);

        separate();

        while (listIterator.hasPrevious()) {
            String coffee = listIterator.previous();
            if (coffee.contains("Cold")) {
                // Cold Brew will be set to null.
                listIterator.set(null);
            }

            if (coffee.startsWith("Spa")) {
                listIterator.add("V6 Coffee");
            }
        }

        System.out.println(list);

        separate();

        list = new ArrayList<>(Arrays.asList(
                "iPhone 16e",
                "Galaxy S25",
                "Xiaomi X15 Ultra",
                "OPPO Reno13 5G",
                "RealMe 14 Series 5G"
        )
        );

        System.out.println(list);

        iterator = list.iterator();

        // Skipping 2 elements: iPhone 16e and Galaxy S25.
        for (var i = 0; i < 2 && iterator.hasNext(); i++) {
            iterator.next();
        }

        iterator.forEachRemaining(phone -> {
            if (phone.endsWith("5G")) {
                System.out.println(phone + " (coming soon)");
            }
        });

        separate();

        list = new ArrayList<>(Arrays.asList(
                "Blueberry",
                "Durian",
                "Apple",
                "Orange",
                "Grape"
        )
        );

        System.out.println(list);

        listIterator = list.listIterator();

        // Previous Index: -1, where it returns the index of the element before the cursor and starts at -1 before any elements are accessed.
        // Element: Blueberry (at index 0)
        // Next Index: 1 (Durian)
        // 
        // Previous Index: 0 (Blueberry)
        // Element: Durian (at index 1)
        // Next Index: 2 (Apple)
        // 
        // Previous Index: 1 (Durian)
        // Element: Apple (at index 2)
        // Next Index: 3 (Orange)
        // 
        // Previous Index: 2 (Apple)
        // Element: Orange (at index 3)
        // Next Index: 4 (Grape)
        // 
        // Previous Index: 3 (Orange)
        // Element: Grape (at index 4)
        // Next Index: 5, the index equals the list size.
        // 
        // Index:     0        1       2       3       4
        //          [Blueberry, Durian, Apple, Orange, Grape]
        // 
        // As you iterate using next(), the cursor moves like this:
        // 
        // 1. Before iteration starts → Cursor is at position 0
        // 2. After next() returns "Blueberry" → Cursor is now at 1
        // 3. After next() returns "Durian" → Cursor is now at 2
        // 4. After next() returns "Apple" → Cursor is now at 3
        // 5. After next() returns "Orange" → Cursor is now at 4
        // 6. After next() returns "Grape" → Cursor is now at 5
        while (listIterator.hasNext()) {
            System.out.println("Previous Index: " + listIterator.previousIndex());
            System.out.println("Element: " + listIterator.next());
            System.out.println("Next Index: " + listIterator.nextIndex());
        }
    }

    private static void separate() {
        System.out.println();
    }

}
