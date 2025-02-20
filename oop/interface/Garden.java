public class Garden {

    public static void main(String[] args) {
        
        Tree oak = new Oak();
        oak.grow();
        oak.fall();
        oak.harvest("oak tree");

        System.out.println(Tree.LEAF_COLOR);
        System.out.println(Tree.HAS_BRANCH);
        System.out.println(Tree.WATER_CONSUMPTION);

        Tree sequioa = new Sequioa();
        sequioa.grow();
        sequioa.fall();
        sequioa.harvest("sequioa tree");
        
    }
}