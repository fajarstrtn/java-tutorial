
import java.util.List;

class Pastry {

    private String name;
    private List<String> ingredients;
    private Integer duration;
    private Double price;
    private Boolean orderStatus = false;

    public Pastry() {
    }

    public Pastry(String name) {
        this(name, null, null, null);
    }

    public Pastry(String name, List<String> ingredients) {
        this(name, ingredients, null, null);
    }

    public Pastry(String name, List<String> ingredients, Integer duration) {
        this(name, ingredients, duration, null);
    }

    public Pastry(String name, List<String> ingredients, Integer duration, Double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Integer getDuration() {
        return duration;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isCheap() {
        return price != null && price >= 0 && price <= 10;
    }

    public String inform() {
        return isCheap() ? "Cheap pastry" : "Pricey pastry";
    }

    public Pastry order() {
        orderStatus = true;
        return this;
    }

    public String checkout() {
        return Boolean.TRUE.equals(orderStatus) ? "Successfully ordered" : "Failed to order";
    }

}

public class Bakery {

    public static void main(String[] args) {
        var pastry1 = new Pastry("Croissant", List.of("Flour", "Butter", "Yeast", "Sugar", "Salt", "Liquid"));
        System.out.println(pastry1.getName());
        System.out.println(pastry1.getIngredients());
        System.out.println(pastry1.getDuration());
        System.out.println(pastry1.getPrice());
        System.out.println(pastry1.inform());
        System.out.println(pastry1.order().checkout());

        var pastry2 = new Pastry("Choux", List.of("Water", "Butter", "Flour", "Eggs", "Salt", "Vanilla"), 60, 25D);
        System.out.println(pastry2.getName());
        System.out.println(pastry2.getIngredients());
        System.out.println(pastry2.getDuration());
        System.out.println(pastry2.getPrice());
        System.out.println(pastry2.inform());
        System.out.println(pastry2.order().checkout());
    }

}
