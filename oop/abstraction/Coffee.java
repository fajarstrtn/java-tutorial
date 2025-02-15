
public abstract class Coffee {

    public String name;
    public String origin;
    public String appearance;
    public String flavour;
    public String caffeineContent;
    public String plantGrowth;
    public Double price;

    /* An abstract class should have at least one abstract method. */
    public abstract void inform();

    /* An abstract method cannot have body. */
    public abstract void roast();

}
