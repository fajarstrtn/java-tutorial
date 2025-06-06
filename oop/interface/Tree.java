
public interface Tree {

    // Interface cannot have instance variables (only static and final constants).
    // If a variable is assigned using '=', Java automatically shift this to constant variable.
    String LEAF_COLOR = "Green";

    final boolean HAS_BRANCH = true;

    static final int WATER_CONSUMPTION = 10;

    void grow();

    void grow(String place);

    void fall();

    default void harvest(String name) {
        System.out.println(name + " is being harvested.");
    }

    default void harvest(String name, String place) {
        System.out.println(name + " is being harvested in " + place + ".");
    }

}
