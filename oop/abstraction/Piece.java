
public class Piece {

    public static void main(String[] args) {

        Shape circle = new Circle("black", 8);
        System.out.println("circle's color: " + circle.getColor());
        System.out.println("circle's area: " + circle.area());

        Circle anotherCircle = (Circle) circle;
        anotherCircle.setColor("green");
        anotherCircle.setRadius(8);
        System.out.println("another circle's color: " + anotherCircle.getColor());
        System.out.println("another circle's radius: " + anotherCircle.getRadius());
        System.out.println("another circle's area: " + anotherCircle.area());

        Shape rectangle = new Rectangle("yellow", 4, 7);
        System.out.println("rectangle's color: " + rectangle.getColor());
        System.out.println("rectangle's area: " + rectangle.area());

        Rectangle anotherRectangle = (Rectangle) rectangle;
        anotherRectangle.setColor("blue");
        anotherRectangle.setWidth(20.5D);
        anotherRectangle.setLength(11.8D);
        System.out.println("another rectangle's color: " + anotherRectangle.getColor());
        System.out.println("another rectangle's width: " + anotherRectangle.getWidth());
        System.out.println("another rectangle's length: " + anotherRectangle.getLength());
        System.out.println("another rectangle's area: " + anotherRectangle.area());

    }
}
