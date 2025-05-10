
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
        List<String> menu = new ArrayList<>(
                Arrays.asList(
                        "Americano",
                        "Spanish Latte",
                        "Mocha",
                        "Macchiato",
                        "Cold Brew"
                )
        );

        for (var coffee : menu) {
            System.out.println(coffee);
        }

        separate();

        // | Feature                  | For-each Loop | Iterator                            |
        // | ------------------------ | ------------- | ----------------------------------- |
        // | Read elements            | ✅ Yes         | ✅ Yes                             |
        // | Remove elements safely   | ❌ No          | ✅ Yes (using `iterator.remove()`) |
        // | Simple syntax            | ✅ Yes         | ❌ No (more verbose)               |
        // | Thread-safe modification | ❌ No          | ✅ Safer (to some extent)          |
        menu.forEach(System.out::println);

        separate();

        // In Java, an Iterator is an object used to traverse (iterate through) elements in a collection (like List, Set, etc.).
        // It's part of the java.util package and provides a safe way to loop through a collection while optionally allowing modification during iteration (e.g., removing elements).
        // It avoids ConcurrentModificationException when removing elements during iteration.
        // Works uniformly across various types of collections.
        Iterator<String> iterator = menu.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() <= 5) {
                iterator.remove();
            }
        }

        System.out.println(menu);

        separate();

        // ListIterator is only available for List implementations (like ArrayList, LinkedList).
        // It supports Bidirectional traversal (hasPrevious(), previous()) and Element modification (set(), add(), remove()).
        ListIterator<String> listIterator = menu.listIterator();

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

        System.out.println(menu);

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

        System.out.println(menu);

        separate();

        List<String> phones = new ArrayList<>(Arrays.asList(
                "iPhone 16e",
                "Galaxy S25",
                "Xiaomi X15 Ultra",
                "OPPO Reno13 5G",
                "RealMe 14 Series 5G"
        )
        );

        System.out.println(phones);

        Iterator<String> phonesIterator = phones.iterator();

        // Skipping 2 elements: iPhone 16e and Galaxy S25.
        for (var i = 0; i < 2 && phonesIterator.hasNext(); i++) {
            phonesIterator.next();
        }

        phonesIterator.forEachRemaining(phone -> {
            if (phone.endsWith("5G")) {
                System.out.println(phone + " (coming soon)");
            }
        });
    }

    private static void separate() {
        System.out.println();
    }

}
