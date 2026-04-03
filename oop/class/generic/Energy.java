
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Water implements Serializable {

    private String type;

    public Water() {
    }

    public Water(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Water toWater(Object object) {
        return (Water) object;
    }

}

class Fire implements Serializable {

    private String type;

    public Fire() {
    }

    public Fire(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Fire toFire(Object object) {
        return (Fire) object;
    }

}

public class Energy {

    private static void read(List<? extends Number> balance) {
        balance.forEach(System.out::println);
    }

    private static void write(List<? super Integer> balance) {
        balance.add(11);
        balance.add(21);
        balance.add(31);
        balance.add(41);
        balance.add(51);
    }

    public static void main(String[] args) {
        /*
         * ? extends Class (Upper Bounded Wildcard) means
         * any type that is class or a subclass (child) of class.
         * It has the same form of List<Integer extends Number> number = new ArrayList<Integer>();
         * 
         * Use this when you only need to read from a generic collection, not modify it. */
        List<? extends Number> numbers = new ArrayList<Integer>();
        numbers = Arrays.asList(10, 20, 30, 40, 50);

        /*
         * You can't add elements (except null) to the list
         * because the compiler doesn't know the specific subtype. */
        numbers.forEach(System.out::println);

        /*
         * ? super Class (Lower Bounded Wildcard) means
         * any type that is class or a superclass (parent) of class.
         * It has the same form of List<Number super Integer> anotherNumbers = new ArrayList<Number>();
         * 
         * Use this when you only need to write to a generic collection. */
        List<? super Integer> anotherNumbers = new ArrayList<Number>();
        anotherNumbers.add(100);

        /*
         * You can't safely read specific types from the list (except as Object)
         * because the compiler doesn't know the actual supertype.
         * 
         * Uncomment this will cause an error.
         * 
         * Syntax:
         * Number number = anotherNumbers.get(0); will cause an error. */
        Object number = anotherNumbers.get(0);
        System.out.println(number);

        List<? extends Number> credit = Arrays.asList(10.5, 3.0, 4.1, 2.7, 5.5);
        read(credit);

        List<? super Integer> debit = new ArrayList<Number>();
        write(debit);
        debit.stream().forEach(System.out::println);

        List<? extends Serializable> entityList;
        entityList = Arrays.asList(
                new Water("Tap Water"),
                new Water("Spring Water"),
                new Water("Mineral Water"),
                new Water("Distilled Water"),
                new Water("Sparkling Water")
        );
        entityList.stream().map(Water::toWater).forEach(entity -> System.out.println(entity.getType()));
        entityList = Arrays.asList(
                new Fire("Ordinary Combustibles"),
                new Fire("Flammable Liquids"),
                new Fire("Flammable Gases"),
                new Fire("Combustible Metals"),
                new Fire("Cooking Oils and Fats")
        );
        entityList.stream().map(Fire::toFire).forEach(entity -> System.out.println(entity.getType()));
    }

}
