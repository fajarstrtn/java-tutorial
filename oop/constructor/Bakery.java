
public class Bakery {

    private String name;
    private String type;
    private boolean homeMade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHomeMade() {
        return homeMade;
    }

    public void setHomeMade(boolean homeMade) {
        this.homeMade = homeMade;
    }

    public static void main(String[] args) {
        /*
         * Java will provide default constructor once an object is created.
         * It will be filled with default value.
         * 
         * Unlike concrete method, constructor might at least be called once.
         * Once you define any constructor (with or without parameters),
         * the compiler no longer provides the default constructor. */
        Bakery bread = new Bakery();
        bread.setName("Bread");
        bread.setType("Wheat");
        bread.setHomeMade(true);
        System.out.println(bread);
        System.out.println(bread.getName());
        System.out.println(bread.getType());
        System.out.println(bread.isHomeMade());
    }

}
