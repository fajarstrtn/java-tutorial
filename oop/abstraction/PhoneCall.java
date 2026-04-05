
interface MobilePhone {

    public void ring();

    public void call();

    public String sayHi(String name);

}

class Nokia implements MobilePhone {

    @Override
    public void ring() {
        System.out.println("Nokia is ringing");
    }

    @Override
    public void call() {
        System.out.println("I\'m trying to call someone using Nokia");
    }

    @Override
    public String sayHi(String name) {
        return "Hi, " + name + "! I\'m using Nokia now";
    }

}

class Motorola implements MobilePhone {

    @Override
    public void ring() {
        System.out.println("Motorola is ringing");
    }

    @Override
    public void call() {
        System.out.println("I\'m trying to call someone using Motorola");
    }

    @Override
    public String sayHi(String name) {
        return "Hi, " + name + "! I\'m using Motorola now";
    }

}

class Samsung implements MobilePhone {

    @Override
    public void ring() {
        System.out.println("Samsung is ringing");
    }

    @Override
    public void call() {
        System.out.println("I\'m trying to call someone using Samsung");
    }

    @Override
    public String sayHi(String name) {
        return "Hi, " + name + "! I\'m using samsung now";
    }

}

public class PhoneCall {

    public static void call(MobilePhone phone) {
        var sayHi = switch (phone) {
            case Nokia nokia ->
                nokia.sayHi("John Doe");
            case Motorola motorola ->
                motorola.sayHi("Jane Doe");
            case Samsung samsung ->
                samsung.sayHi("Liam Gallagher");
            default ->
                "I cannot find my phone";
        };
        System.out.println(sayHi);
    }

    public static void main(String[] args) {
        MobilePhone phone;
        phone = new Nokia();
        phone.ring();
        phone.call();
        call(phone);

        phone = new Motorola();
        phone.ring();
        phone.call();
        call(phone);

        phone = new Samsung();
        phone.ring();
        phone.call();
        call(phone);
    }

}
