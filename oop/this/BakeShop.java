
import java.util.List;

public class BakeShop {

    public static void main(String[] args) {

        var croissant = new Pastry("croissant", List.of("flour", "butter", "yeast", "sugar", "salt", "liquid"));

        System.out.println(croissant.getName());
        System.out.println(croissant.getIngredients());
        System.out.println(croissant.getDuration());
        System.out.println(croissant.getPrice());

    }

}

class Pastry {

    private String name;
    private List<String> ingredients;
    private Integer duration;
    private Double price;

    public Pastry() {
    }

    public Pastry(String name) {
        this.name = name;
    }

    public Pastry(String name, List<String> ingredients) {
        this(name);
        this.ingredients = ingredients;
    }

    public Pastry(String name, List<String> ingredients, Integer duration) {
        this(name, ingredients);
        this.duration = duration;
    }

    public Pastry(String name, List<String> ingredients, Integer duration, Double price) {
        this(name, ingredients, duration);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
