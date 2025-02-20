public class Oak implements Tree {

    @Override
    public void grow() {
        System.out.println("oak tree is growing");
    }

    @Override
    public void grow(String fieldName) {
        System.out.println("oak tree is growing in " + fieldName);
    }

    @Override
    public void fall() {
        System.out.println("oka tree is falling");
    }
    
}