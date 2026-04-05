
public class Oak implements Tree {

    @Override
    public void grow() {
        System.out.println("Oak tree is growing.");
    }

    @Override
    public void grow(String fieldName) {
        System.out.println("Oak tree is growing in " + fieldName + ".");
    }

    @Override
    public void fall() {
        System.out.println("Oak tree is falling.");
    }

}
