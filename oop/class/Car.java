
public class Car {

    String name;
    double tankCapacity;
    double cc;

    // This constructor declaration leads to an error which the variables are set to default values.
    // public Car(String name, double tankCapacity, double cc) {
    //     name = name;
    //     tankCapacity = tankCapacity;
    //     cc = cc;
    // }
    // 
    // Use "this" keyword to refer to the class attributes instead of param variables.
    public Car(String name, double tankCapacity, double cc) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.cc = cc;
    }

    public void inform(String name) {
        // Variable shadowing occurs when a subclass or method declares a variable 
        // with the same name as one in the superclass or outer scope, potentially causing confusion 
        // and unintended behavior.
        System.out.println(name);
    }

    public void inform(String name, double tankCapacity, double cc) {
        System.out.println(name);
        System.out.println(tankCapacity);
        System.out.println(cc);
        System.out.println(this.name);
        System.out.println(this.tankCapacity);
        System.out.println(this.cc);
    }

    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari Spyder", 86, 3855);

        // It returns "becky" instead of ferrari spyder.
        // ferrari.inform("Harold");
        // 
        // Since class constructor has its declaration:
        // public Car(String name, double tankCapacity, double cc) {
        //     name = name;
        //     tankCapacity = tankCapacity;
        //     cc = cc;
        // }
        // 
        // It only reinitialize param variables instead of class attributes.
        // To overcome this problem, set variables with "this" keyword.
        ferrari.inform("F8 Tributo", 78, 3902);
    }

}
