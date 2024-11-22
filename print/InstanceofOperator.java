
public class InstanceofOperator {

    public static void main(String[] args) {
        
        Human timotee = new Man();
        Human kylie = new Woman();

        System.out.println("is timotee instance of man? " + (timotee instanceof Man));
        System.out.println("is kylie instance of man? " + (kylie instanceof Man));
        System.out.println("is kylie instance of woman? " + (kylie instanceof Woman));
        System.out.println("is kylie instance of period? " + (kylie instanceof Period));
        
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
