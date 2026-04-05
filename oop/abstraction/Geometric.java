
abstract class Shape {

    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

}

class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}

class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

}

public class Geometric {

    public static void main(String[] args) {
        Shape circle = new Circle("Black", 8);
        System.out.println(circle.getColor()); // Output: Black
        System.out.println(circle.area());     // Output: 201.06192982974676

        Circle anotherCircle = (Circle) circle;
        anotherCircle.setColor("Green");
        anotherCircle.setRadius(8);
        System.out.println(anotherCircle.getColor());  // Output: Green
        System.out.println(anotherCircle.getRadius()); // Output: 8.0
        System.out.println(anotherCircle.area());      // Output: 201.06192982974676

        Shape rectangle = new Rectangle("Yellow", 4, 7);
        System.out.println(rectangle.getColor()); // Output: Yellow
        System.out.println(rectangle.area());     // Output: 28.0

        Rectangle anotherRectangle = (Rectangle) rectangle;
        anotherRectangle.setColor("Blue");
        anotherRectangle.setWidth(20.5D);
        anotherRectangle.setLength(11.8D);
        System.out.println(anotherRectangle.getColor());  // Output: Blue
        System.out.println(anotherRectangle.getWidth());  // Output: 20.5
        System.out.println(anotherRectangle.getLength()); // Output: 11.8
        System.out.println(anotherRectangle.area());      // Output: 241.9
    }

}
