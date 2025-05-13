
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Monster {
   
   public static void main(String[] args) {
      // Declaring a LinkedList.
      LinkedList<String> monsters = new LinkedList<>();

      // Adding each element at the end of the list automatically.
      monsters.add("Godzilla");
      monsters.add("Gamera");
      monsters.add("King Ghidorah");
      monsters.add("Rodan");
      monsters.add("Anguirus");

      System.out.println("First occurence of list: " + monsters);

      // Counting size of the list.
      for (var i = 0; i < monsters.size(); ++i) {
         // Retrieving element of the list.
         System.out.println("Iterating with for-loop: " + monsters.get(i));
      }

      for (var monster : monsters) {
         System.out.println("Iterating with enhanced for-loop: " + monster + ".");
      }

      ListIterator<String> listIterator = monsters.listIterator();
      while (listIterator.hasNext()) {
         String monster = listIterator.next();
         System.out.println("Iterating with ListIterator: " + monster);
      }

      // Adding an element to the list at specific index.
      monsters.add(3, "Zetton");

      // LinkedList allows duplicate elements.
      LinkedList<String> targetMonsters = new LinkedList<>(
      Arrays.asList("Godzilla", "Godzilla")
      );

      // Bulking all elements at the end of the list.
      monsters.addAll(targetMonsters);

      System.out.println("Second occurence of list: " + monsters);

      LinkedList<String> upcomingMonsters = new LinkedList<>(
      Arrays.asList("Kumonga", "Megalon", "Hedorah", "Leatherback", "Slattern")
      );

      // Bulking all elements at specific index.
      monsters.addAll(1, upcomingMonsters);

      System.out.println("Third occurence of list: " + monsters);

      // Adding an element at the beginning of the list.
      monsters.addFirst("Otachi");

      // Adding an element at the end of the list.
      monsters.addLast("Biollante");

      System.out.println("Fourth occurence of list: " + monsters);

      // Removing an element at the beginning of the list.
      monsters.removeFirst();

      // Removing an element at the end of the list.
      monsters.removeLast();

      System.out.println("Fifth occurence of list: " + monsters);
      
      // Removing all elements from the ArrayList that satisfy a given predicate filter.
      // This method returns true if any elements were removed; otherwise, false.
      // This method throws NullPointerException if the specified filter is null.
      boolean hasGodzilla = monsters.removeIf(Monster::hasGodzilla);
      System.out.println("Is Godzilla successfully deleted in the list? " + hasGodzilla + ".");

      System.out.println("Sixth occurence of list: " + monsters);

      // Checking if this list contains all of the elements in the specified collection.
      // So basically it is used to check if a list contains a set of elements or not.
      // The method returns true if all elements in the collection are present in the list otherwise it returns false.
      LinkedList<String> knownMonsters = new LinkedList<>(
      Arrays.asList("Gigan", "Gamera", "Zetton")
      );
      boolean hasKnownMonsters = monsters.containsAll(knownMonsters);
      System.out.println("Are these monsters on the target list? " + hasKnownMonsters + ".");

      System.out.println("Seventh occurence of list: " + monsters);

      // The getFirst method returns the first item in a list.
      String firstMonster = monsters.getFirst();
      // The getLast method returns the last item in a list.
      String lastMonster = monsters.getLast();
      System.out.println("We have " + firstMonster + " and " + lastMonster + " on the list.");

      // Searching the index of the first occurrence of the specified element in the list.
      int indexOfGigan = monsters.indexOf("Gigan");
      System.out.println("Index of \"Gigan\" is " + indexOfGigan + ".");

      // Reversing the order of the list (from tail to head).
      List<String> reversedMonsters = monsters.reversed();
      System.out.println("Reversed monsters: " + reversedMonsters);

      System.out.println("Eighth occurence of list: " + monsters);

      // Cleaning-up the list.
      monsters.clear();

      // Counting size of the list after cleaning-up.
      int sizeOfMonsters = monsters.size();

      System.out.println("After cleaning-up the list: " + monsters);
      System.out.println("Size of the list: " + sizeOfMonsters);
   }

   private static boolean hasGodzilla(String monster) {
      return monster.equalsIgnoreCase("godzilla");
   }

}
