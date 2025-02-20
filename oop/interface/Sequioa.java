public class Sequioa implements Tree {

    @Override
    public void grow() {
        System.out.println("sequioa tree is growing");
    }

    @Override
    public void grow(String fieldName) {
        System.out.println("sequioa tree is growing in " + fieldName);
    }

    @Override
    public void fall() {
        System.out.println("sequioa tree is falling");
    }

    @Override
    public void harvest(String name) {
        System.out.println(name + " cannot be harvested");
    }
}