
interface Invisible {
}

class Person {
}

class Boy extends Person {
}

class Girl extends Person {
}

class Ghost extends Person implements Invisible {
}

public class InstanceChecker {

    public static void main(String[] args) {
        Person person = new Person();
        Person boy = new Boy();
        Person girl = new Girl();
        Person ghost = new Ghost();

        System.out.println(person instanceof Person);   // Output: true
        System.out.println(boy instanceof Person);      // Output: true
        System.out.println(girl instanceof Person);     // Output: true
        System.out.println(ghost instanceof Person);    // Output: true
        System.out.println(ghost instanceof Invisible); // Output: true
        System.out.println(ghost instanceof Boy);       // Output: false
    }

}
