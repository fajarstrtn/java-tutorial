public class Garden {

    public static void main(String[] args) {
        
        Tree oak = new Oak();
        oak.grow();
        oak.fall();

        System.out.println(Tree.LEAF_COLOR);
        System.out.println(Tree.HAS_BRANCH);
        System.out.println(Tree.WATER_CONSUMPTION);
        
    }
}