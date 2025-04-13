
public class Math {

    public static void main(String[] args) {

        Calculation calculation = (int x, int y) -> x + y;
        int result = calculation.add(10, 5);
        calculation.show(result);

    }

}

/* Adding more than one abstract method will cause an error since functional interface only allows
one abstract method. */
@FunctionalInterface
interface Calculation {

    int add(int x, int y);

    /* Functional interface can have multiple default methods and static methods, but only one abstract method. */
    default void show(int result) {
        System.out.println("result: " + result);
    }

}
