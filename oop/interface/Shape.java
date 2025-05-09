
import java.lang.Math;

public class Shape {

    public static void main(String... args) {
        var square = new Square();
        square.setSide(5);
        square.print();

        var cube = new Cube();
        cube.setSide(5);
        cube.print();
    }

}

interface Printable {

    void print();

}

interface TwoDimensionShape extends Printable {

    double calculateArea();

    double calculatePerimeter();

}

interface ThreeDimensionShape extends Printable {

    double calculateSurfaceArea();

    double calculateVolume();

}

class Square implements TwoDimensionShape {

    private double side;

    public Square() {
        this.side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        System.out.println("Area of square is " + calculateArea() + ".");
        System.out.println("Perimeter of square is " + calculatePerimeter() + ".");
    }

    public void setSide(double side) {
        this.side = side;
    }

}

class Cube implements ThreeDimensionShape {

    private double side;

    public Cube() {
        this.side = 0;
    }

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * (Math.pow(side, 2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public void print() {
        System.out.println("Surface Area of cube is " + calculateSurfaceArea() + ".");
        System.out.println("Volume of cube is " + calculateVolume() + ".");
    }

    public void setSide(double side) {
        this.side = side;
    }

}
