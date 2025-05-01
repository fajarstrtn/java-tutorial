
public class Generic {

    public static void main(String[] args) {

        Printer<Integer> integerPrinter = new Printer<>();
        integerPrinter.setValue(20);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.setValue(10.5);
        doublePrinter.print();

        // This 'var' is local variable type inference.
        // It allows user to declare local variables without explicitly specifying their type.
        // The compiler infers the type based on the value assigned to the variable.
        var stringPrinter = new Printer<String>();
        stringPrinter.setValue("Hello World!");
        stringPrinter.print();

    }

}

// Type 'T' in generic class is a placeholder for the type of variable.
// User can name it in different ways, but it is part of convention.
class Printer<T> {

    private T value;

    public Printer() {
        // No-args constructor.
    }

    public Printer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

}
