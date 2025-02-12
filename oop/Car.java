
public class Car {

    private String name;

    private Double fuelTankCapacity;

    private Double cc;

    public Car(String name, Double fuelTankCapacity, Double cc) {

/*      variable shadowing in java occurs when a variable declared in a subclass or
        a method hides or "shadows" a variable of the same name declared in the superclass or
        an outer scope. this can create confusion if not handled carefully,
        as it may lead to unintended behavior. */
        name = name;
        fuelTankCapacity = fuelTankCapacity;
        cc = cc;

    }

    public void inform(String name) {

        System.out.println(name);

    }

    public static void main(String[] args) {

        var ferrari = new Car("ferrari spyder", 86D, 3855D);

/*      this will print "justin" instead of "ferrari spyder". */
        ferrari.inform("justin");

    }

}
