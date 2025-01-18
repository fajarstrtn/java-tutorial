
public class Human {

    public String name;

    public Integer age;

    public Human() {

    }

    public Human(String name, Integer age) {

        this.name = name;
        this.age = age;

    }

    public void print() {

        System.out.println("hi, my name is " + this.name + " and i am " + this.age + " years-old");

    }

    public static void main(String[] args) {

        Human jack = new Human();

        jack.name = "jack hummings";
        jack.age = 28;

        jack.print();

        Human gerard = new Human("gerard way", 25);

        gerard.print();

    }

}
