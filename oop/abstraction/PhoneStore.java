
public class PhoneStore {

    public static void isOnTheCall(CellPhone phone) {
        var greetings = switch (phone) {
            case Nokia nokia ->
                nokia.greet("Lucas");
            case Motorola motorola ->
                motorola.greet("Peggy");
            case Samsung samsung ->
                samsung.greet("Yvone");
            default ->
                "I cannot find any phones.";
        };

        System.out.println(greetings);
    }

    public static void main(String[] args) {
        CellPhone phone;

        phone = new Nokia();
        phone.ring();
        phone.call();
        isOnTheCall(phone);

        phone = new Motorola();
        phone.ring();
        phone.call();
        isOnTheCall(phone);

        phone = new Samsung();
        phone.ring();
        phone.call();
        isOnTheCall(phone);
    }

}
