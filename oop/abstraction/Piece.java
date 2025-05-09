
public class Piece {

    public static void main(String[] args) {

        Shape circle = new Circle("Black", 8);
        System.out.println("Circle's color: " + circle.getColor());
        System.out.println("Circle's area: " + circle.area());

        Circle anotherCircle = (Circle) circle;
        anotherCircle.setColor("Green");
        anotherCircle.setRadius(8);
        System.out.println("Another circle's color: " + anotherCircle.getColor());
        System.out.println("Another circle's radius: " + anotherCircle.getRadius());
        System.out.println("Another circle's area: " + anotherCircle.area());

        Shape rectangle = new Rectangle("Yellow", 4, 7);
        System.out.println("Rectangle's color: " + rectangle.getColor());
        System.out.println("Rectangle's area: " + rectangle.area());

        Rectangle anotherRectangle = (Rectangle) rectangle;
        anotherRectangle.setColor("Blue");
        anotherRectangle.setWidth(20.5D);
        anotherRectangle.setLength(11.8D);
        System.out.println("Another rectangle's color: " + anotherRectangle.getColor());
        System.out.println("Another rectangle's width: " + anotherRectangle.getWidth());
        System.out.println("Another rectangle's length: " + anotherRectangle.getLength());
        System.out.println("Another rectangle's area: " + anotherRectangle.area());

    }

}
