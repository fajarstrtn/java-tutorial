
public class Peripheral {

    private static final String TEXT = "lorem ipsum dolor sit amet";

    public static void main(String[] args) {

        var keyboard = new Keyboard();

        keyboard.setBrand("logitech");
        keyboard.setModel("wired");

        keyboard.displayInfo(Keyboard.class.getName().toLowerCase());
        keyboard.typeText(TEXT);

        var mechanical = new MechanicalKeyboard();

        mechanical.setBrand("razer");
        mechanical.setModel("mechanical");
        mechanical.setSwitchType("cherry mx red");

        mechanical.displayInfo(MechanicalKeyboard.class.getName().toLowerCase());
        mechanical.typeText(TEXT);

        var regular = new RegularKeyboard();

        regular.setBrand("dell");
        regular.setModel("kb216");
        regular.setHasNumericPad(true);

        regular.displayInfo(RegularKeyboard.class.getName().toLowerCase());
        regular.typeText(TEXT);

        var monitor = new Monitor();

        monitor.setBrand("lg");
        monitor.setModel("24mr400-b");
        monitor.setInches(23.8);
        monitor.setPrice(79.52);

        monitor.greetCustomer("hayley williams");

        var ledMonitor = new LEDMonitor();

        ledMonitor.setBrand("samsung");
        ledMonitor.setModel("t35f");
        ledMonitor.setInches(24D);
        ledMonitor.setPrice(99.99);

        ledMonitor.greetCustomer("jack dorsy");

    }

}
