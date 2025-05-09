
public class Mango extends Fruit {

    private String shape;

    public Mango() {
        super();
    }

    public Mango(String shape) {
        this();
        this.shape = shape;
    }

    public Mango(String name, String shape) {
        super(name);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public void inform() {
        super.inform();
        System.out.println("The shape is " + shape + ".");
    }

}
