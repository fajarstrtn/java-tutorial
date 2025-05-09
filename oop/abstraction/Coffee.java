
public abstract class Coffee {

    public String name;
    public String origin;
    public String appearance;
    public String flavour;
    public String caffeineContent;
    public String plantGrowth;
    public Double price;

    // An abstract class should have at least one abstract method.
    // Yet, it cannot have body.
    // This abstract method needs to be overrided in its subclasses.
    public abstract void inform();

    public abstract void roast();

}
