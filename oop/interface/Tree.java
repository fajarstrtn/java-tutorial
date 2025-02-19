
public interface Tree {

    /*  Interface cannot have instance variables (only static and final constants).
    If a variable is assigned using '=', Java automatically shift this to constant variable. */
    String LEAF_COLOR = "green";

    final boolean HAS_BRANCH = true;

    static final int WATER_CONSUMPTION = 10;

    void grow();

    void fall();

}
