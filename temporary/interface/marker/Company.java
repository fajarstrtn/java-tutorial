
public class Company {

    public static void main(String[] args) {
        Asset employee = new Employee();
        Guest guest = new Guest();

        if (employee instanceof Asset) {
            System.out.println("Employee is an asset.");
        } else {
            System.out.println("Employee is not an asset.");
        }

        if (guest instanceof Asset) {
            System.out.println("Guest is an asset.");
        } else {
            System.out.println("Guest is not an asset.");
        }
    }

}

interface Asset {
}

class Employee implements Asset {
}

class Guest {
}
