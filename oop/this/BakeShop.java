
import java.util.List;

public class BakeShop {

    public static void main(String[] args) {
        var croissant = new Pastry("Croissant", List.of("Flour", "Butter", "Yeast", "Sugar", "Salt", "Liquid"));
        System.out.println(croissant.getName());
        System.out.println(croissant.getIngredients());
        System.out.println(croissant.getDuration());
        System.out.println(croissant.getPrice());
        System.out.println(croissant.inform());
        System.out.println(croissant.order().checkout());

        var choux = new Pastry("Choux", List.of("Water", "Butter", "Flour", "Eggs", "Salt", "Vanilla"), 60, 25D);
        System.out.println(choux.getName());
        System.out.println(choux.getIngredients());
        System.out.println(choux.getDuration());
        System.out.println(choux.getPrice());
        System.out.println(choux.inform());
        System.out.println(choux.order().checkout());
    }

}

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
        return name + (isCheap() ? " is a cheap pastry." : " is an expensive pastry.");
    }

    public Pastry order() {
        orderStatus = true;
        return this;
    }

    public String checkout() {
        return name + (Boolean.TRUE.equals(orderStatus) ? " is successfully ordered." : " is not ordered yet.");
    }

}
