
public class BlueBerry extends Fruit {

    private boolean sour;

    public BlueBerry() {
        super();
    }

    public BlueBerry(boolean sour) {
        this();
        this.sour = sour;
    }

    public BlueBerry(String name, boolean sour) {
        super(name);
        this.sour = sour;
    }

    public boolean isSour() {
        return sour;
    }

    public void setSour(boolean sour) {
        this.sour = sour;
    }

    @Override
    public void inform() {
        super.inform();
        System.out.println("This flavour is " + (sour ? "sour." : "not sour."));
    }

}
