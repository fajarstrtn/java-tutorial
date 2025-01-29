
public class Peripheral {

    public static void main(String[] args) {

        var keyboard = new Keyboard();

        keyboard.setBrand("logitech");
        keyboard.setModel("wired");

        keyboard.displayInfo(Keyboard.class.getName().toLowerCase());
        keyboard.typeText("lorem ipsum dolor sit amet");

        var mechanical = new MechanicalKeyboard();

        mechanical.setBrand("razer");
        mechanical.setModel("mechanical");
        mechanical.setSwitchType("cherry mx red");

        mechanical.displayInfo(MechanicalKeyboard.class.getName().toLowerCase());
        mechanical.typeText("lorem ipsum dolor sit amet");

        var regular = new RegularKeyboard();

        regular.setBrand("dell");
        regular.setModel("kb216");
        regular.setHasNumericPad(true);

        regular.displayInfo(RegularKeyboard.class.getName().toLowerCase());
        regular.typeText("lorem ipsum dolor sit amet");

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
