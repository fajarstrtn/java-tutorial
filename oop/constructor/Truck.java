
public class Truck {

    private String name;
    private double tankCapacity;
    private double cc;

    public Truck() {
    }

    /* The initializer block contains the code that is always executed
    whenever an instance is created and it runs each time when an object of the class is created. */
    {
        name = "kamaz";
        tankCapacity = 350;
        cc = 11760;
    }

    public String getName() {
        return name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getCc() {
        return cc;
    }

    public static void main(String[] args) {

        Truck rally = new Truck();

        System.out.println(rally.getName());
        System.out.println(rally.getTankCapacity());
        System.out.println(rally.getCc());

    }
}
