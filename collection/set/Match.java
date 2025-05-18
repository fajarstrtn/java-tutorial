
import java.util.Set;
import java.util.EnumSet;
import java.util.Iterator;

public class Match {

    public static void main(String[] args) {
        Set<Game> game1 = EnumSet.allOf(Game.class);
        Set<Game> game2 = EnumSet.noneOf(Game.class);

        game2.add(Game.HOCKEY);

        System.out.println("Value of game1 is " + game1);
        System.out.println("Value of game2 is " + game2);

        game2.addAll(game1);

        System.out.println("Value of game2 after insertion is " + game2);

        for (var game : game1) {
            System.out.println("Iterating over enhanced for-loop: " + game);
        }

        Iterator<Game> iterator = game2.iterator();

        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println("Iterating over iterator: " + game);
        }

        game1.forEach(System.out::println);
        game2.forEach(System.out::println);

        boolean isGame1Empty = game1.isEmpty();
        System.out.println("Is game1 empty? " + isGame1Empty + ".");

        boolean isGame2Empty = game2.isEmpty();
        System.out.println("Is game2 empty? " + isGame2Empty + ".");

        boolean containsHocker = game1.contains(Game.HOCKEY);
        System.out.println("Is Hockey available in game1? " + containsHocker + ".");

        // Checking for equality between two sets.
        // This method verifies whether the elements of one set are equal to the elements of another set.
        boolean isEqual = game1.equals(game2);
        System.out.println("Is game1 equal to game2? " + isEqual + ".");

        boolean isPoloRemoved = game1.removeIf(Match::hasPolo);
        System.out.println("Is Polo removed? " + isPoloRemoved + ".");
        System.out.println("Value of game1 after Polo deletion is " + game1);

        boolean isSoccerRemoved = game1.remove(Game.SOCCER);
        System.out.println("Is Soccer removed? " + isSoccerRemoved + '.');
        System.out.println("Value of game1 after Soccer deletion is " + game1);

        boolean isGame1Removed = game1.removeAll(game1);
        System.out.println("Is game1 removed? " + isGame1Removed + '.');
        System.out.println("Value of game1 after full deletion is " + game1);

        game2.clear();
        System.out.println("Value of game2 after cleaning up is " + game2);

        int size = game1.size();
        System.out.println("Size of game1 is " + size);

        // EnumSet in Java does maintain the natural order (i.e., the order in which enum constants are declared in the enum type).
        // EnumSet is ordered by the enum's declaration order, not insertion order.
        // It is highly efficient and uses a bit vector internally.
        // Only works with enums, and all elements must be from the same enum type.
        // If you need insertion order, use a LinkedHashSet<Game> instead. But for performance and natural enum logic, EnumSet is generally better.
        Set<Game> myGame = EnumSet.allOf(Game.class);
        Set<Game> yourGame = EnumSet.noneOf(Game.class);

        yourGame.add(Game.CRICKET);
        yourGame.add(Game.POLO);
        yourGame.add(Game.SOCCER);

        System.out.println("Value of myGame is " + myGame); // [HOCKEY, POLO, SOCCER, BASKET_BALL, BASEBALL, CRICKET]
        System.out.println("Value of yourGame is " + yourGame); // [POLO, SOCCER, CRICKET]

        // Retaining only the elements in a collection that are also present in another collection.
        // It modifies the current collection by removing elements that are not in the specified collection.
        myGame.retainAll(yourGame);
        System.out.println("Value of myGame after retaining is " + myGame);
    }

    private static boolean hasPolo(Game game) {
        return game.equals(Game.POLO);
    }

}

enum Game {
    HOCKEY, POLO, SOCCER, BASKET_BALL, BASEBALL, CRICKET
}
