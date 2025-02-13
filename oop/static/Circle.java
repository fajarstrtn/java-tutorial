
public class Circle {

    final double PI = 3.14;

    public static void main(String[] args) {

        Circle circle = new Circle();

/*      override a final field will cause an error
        circle.PI = (double) 22 / 7; */
        System.out.println("pi value is " + circle.PI);

    }

}
