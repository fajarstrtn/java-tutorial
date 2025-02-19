public interface Tree {

    String LEAF_COLOR = "green";

    final boolean HAS_BRANCH = true;

    static final int WATER_CONSUMPTION = 10;

    void grow();

    void fall();

}