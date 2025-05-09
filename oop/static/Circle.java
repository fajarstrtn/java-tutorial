
public class Circle {

    // Constant field cannot be reassigned new value.
    final double PI = 3.14;

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("PI value is " + circle.PI + ".");
    }

}
