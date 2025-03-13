
import java.util.List;
import java.util.Optional;

public class BakeShop {

    public static void main(String[] args) {

        var croissant = new Pastry("croissant", List.of("flour", "butter", "yeast", "sugar", "salt", "liquid"));

        System.out.println(croissant.getName());
        System.out.println(croissant.getIngredients());
        System.out.println(croissant.getDuration());
        System.out.println(croissant.getPrice());
        System.out.println(croissant.inform());

        var choux = new Pastry("choux", List.of("water", "butter", "flour", "eggs", "salt", "vanilla"), 60, 25D);

        System.out.println(choux.getName());
        System.out.println(choux.getIngredients());
        System.out.println(choux.getDuration());
        System.out.println(choux.getPrice());
        System.out.println(choux.inform());

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

    public boolean isCheap() {
        if (Optional.ofNullable(price).isEmpty())
            price = 0D;

        return price >= 0 && price <= 10;
    }

    public String inform() {
        return this.isCheap() ? name.concat(" is a cheap pastry") : name.concat(" is an expensive pastry");
    }

}
