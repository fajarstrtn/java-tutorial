/* Here is the demonstration of Multi-Level Inheritance. */
public class Branch {

    public static void main(String[] args) {

        var bank = new ConcreteBank();
        bank.account();
        bank.deposit();
        bank.withdraw();
        bank.loan();

    }

}

/* Level 1 - Interface defining bank operations. */
interface Bank {

    void deposit();

    void withdraw();

    void loan();

    void account();

}

/* Level 2 - Abstract class implementing deposit method. */
abstract class BaseBank implements Bank {

    @Override
    public void deposit() {
        System.out.println("Your deposit amount: $1000.");
    }

}

/* Level 3 - Extending BaseBank and implementing withdraw method. */
abstract class AdvanceBank extends BaseBank {

    @Override
    public void withdraw() {
        System.out.println("Your withdraw amount: $500.");
    }

}

/* Level 4 - Concrete class implementing remaining methods. */
class ConcreteBank extends AdvanceBank {

    @Override
    public void loan() {
        System.out.println("Your loan application has been submitted.");
    }

    @Override
    public void account() {
        System.out.println("Your account setup finished a minute ago.");
    }

}
