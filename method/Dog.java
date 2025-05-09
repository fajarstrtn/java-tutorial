
public class Dog {

    public String name;
    public byte age;

    public void printInformation() {
        System.out.println("Hi, its name is " + this.name + ".");
        System.out.println("It is " + this.age + " years-old.");
    }

    public static void printInformation(String name) {
        System.out.println(name + " has been left.");
    }

    public static void main(String[] args) {
        Dog krypto = new Dog();
        krypto.name = "Krypto";
        krypto.age = 15;
        krypto.printInformation();
    }

}
