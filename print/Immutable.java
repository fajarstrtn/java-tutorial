
public class Immutable {

    public static void main(String[] args) {
        int salary = 5_000_000;
        System.out.println("My salary is " + salary + ".");

        int bonus = salary;
        bonus += 10_000_000;

        System.out.println("My bonus is " + bonus + ".");
        System.out.println("My salary after getting changed is " + salary + ".");
    }

}
