
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

        System.out.println("hi, this is " + this.name);
        System.out.println("it is " + this.age + " years-old");
        System.out.println("is this a mammal? " + (this.isMammal ? "yes, it is" : "no, it is not"));

    }

    public static void printInformation(String visitor) {

/*      using "this" keyword to call any instance attributes or methods inside of this static method
        will cause an error because "this" belongs to an instance of a class.
        meanwhile, static attributes or methods belongs to its class itself.

        System.out.println(this.name + this.age + this.isMammal); */
        System.out.println("welcome to the zoo, " + visitor + "!\n");

    }

    public static void main(String[] args) {

        Zoo tiger = new Zoo();

        tiger.name = "gerrard";
        tiger.age = 10;
        tiger.isMammal = true;

        tiger.printInformation();

        Zoo.printInformation("henry");

        Zoo python = new Zoo("phoebe", 5, false);

        python.printInformation();

        Zoo.printInformation("helena");

    }

}
