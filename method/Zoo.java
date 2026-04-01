
public class Zoo {

    public String name;
    public int age;
    public boolean isMammal;

    public Zoo(String name, Integer age, Boolean isMammal) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Zoo() {
        // No-args constructor
    }

    public void print() {
        System.out.println("Hi! This is " + this.name);
        System.out.println("He\'s " + this.age + " years-old");
        System.out.println("Is he a mammal? " + (isMammal ? "Yes, it is" : "No, it is not"));
    }

    public static void print(String visitor) {
        /*
         * Using this keyword to call any instance attributes or methods inside of this static method
         * will cause an error because this belongs to an instance of a class.
         * 
         * Meanwhile, static attributes or methods belongs to its class itself.
         * 
         * Syntax:
         * System.out.println(this.name + this.age + this.isMammal); */
        System.out.println("Welcome to the zoo, " + visitor);
    }

    public static void main(String[] args) {
        var tiger = new Zoo();

        tiger.name = "Jack";
        tiger.age = 10;
        tiger.isMammal = true;

        tiger.print();      // Output: Hi! This is Jack\nHe's 10 years-old\nIs he a mammal? Yes, it is
        Zoo.print("Henry"); // Output: Welcome to the zoo, Henry

        var python = new Zoo("Julian", 5, false);

        python.print();        // Output: Hi! This is Julian\nHe's 5 years-old\nIs he a mammal? No, it is not
        Zoo.print("Victoria"); // Output: Welcome to the zoo, Victoria
    }

}
