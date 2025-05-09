
public class BakeryShop {

    public static void main(String[] args) {
        // Java will provide default constructor once an object is created.
        // Then, it will be filled with default value. Unlike concrete method,
        // constructor might at least be called once.
        // Once you define any constructor (with or without parameters),
        // the compiler no longer provides the default constructor.
        Bakery bread = new Bakery();
        bread.setName("bread");
        bread.setType("wheat");
        bread.setHomeMade(true);

        System.out.println(bread);
        System.out.println(bread.getName());
        System.out.println(bread.getType());
        System.out.println(bread.isHomeMade());
    }

}
