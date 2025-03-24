
public class Zoo {

    public String name;
    public Integer age;
    public Boolean isMammal;

    public Zoo(String name, Integer age, Boolean isMammal) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Zoo() {
    }

    public void printInformation() {

        System.out.println("Hi, this is " + this.name);
        System.out.println("It is " + this.age + " years-old");
        System.out.println("Is this a mammal? " + (this.isMammal ? "yes, it is" : "no, it is not"));

    }

    public static void printInformation(String visitor) {

        /* Using "this" keyword to call any instance attributes or methods inside of this static method
        will cause an error because "this" belongs to an instance of a class.
        Meanwhile, static attributes or methods belongs to its class itself.

        System.out.println(this.name + this.age + this.isMammal); */
        System.out.println("Welcome to the zoo, " + visitor + "!\n");

    }

    public static void main(String[] args) {

        Zoo tiger = new Zoo();
        tiger.name = "Gerrard";
        tiger.age = 10;
        tiger.isMammal = true;
        tiger.printInformation();

        Zoo.printInformation("Henry");
        Zoo python = new Zoo("Phoebe", 5, false);
        python.printInformation();
        Zoo.printInformation("Victoria");

    }

}
