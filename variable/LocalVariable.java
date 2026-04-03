
public class LocalVariable {

    public int getNumber() {
        int number = 99;
        number += 100;
        return number;
    }

    public static void main(String[] args) {
        int localVariable = 100_000;
        System.out.println(localVariable); // Output: 100000

        // To access instance variables or methods in static context, you must create an object.
        var instanceVariable = new LocalVariable();
        System.out.println(instanceVariable.getNumber()); // Output: 199
    }

}
