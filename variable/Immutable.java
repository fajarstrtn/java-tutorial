
public class Immutable {

    public static void main(String[] args) {
        int salary = 5_000_000;

        System.out.println(salary); // Output: 5000000

        int bonus = salary;
        bonus += 10_000_000;

        System.out.println(bonus);  // Output: 15000000
        System.out.println(salary); // Output: 5000000
    }

}
