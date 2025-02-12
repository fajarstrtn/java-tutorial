
public class PhoneStore {

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

    public static void isOnTheCall(CellPhone phone) {

        var greetings = switch (phone) {
            case Nokia nokia ->
                nokia.greet("lucas");
            case Motorola motorola ->
                motorola.greet("pearl");
            case Samsung samsung ->
                samsung.greet("yvone");
            default ->
                "i cannot find any phones";
        };

        System.out.println(greetings);

    }
}
