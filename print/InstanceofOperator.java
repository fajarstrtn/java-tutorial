
public class InstanceofOperator {

    public static void main(String[] args) {
        Human timotee = new Man();
        Human kylie = new Woman();

        System.out.println("Is Timotee 'instanceof' Man? " + (timotee instanceof Man));
        System.out.println("Is Kylie 'instanceof' Man? " + (kylie instanceof Man));
        System.out.println("Is Kylie 'instanceof' Woman? " + (kylie instanceof Woman));
        System.out.println("Is Kylie 'instanceof' Period? " + (kylie instanceof Period));
    }

}

class Human {
}

class Man extends Human {
}

class Woman extends Human implements Period {
}

interface Period {
}
