
public class Peripheral {

    private static final String TEXT = "Lorem ipsum dolor sit amet";

    public static void main(String[] args) {

        var keyboard = new Keyboard();
        keyboard.setBrand("Logitech");
        keyboard.setModel("Wired");
        keyboard.displayInfo(Keyboard.class.getName().toLowerCase());
        keyboard.typeText(TEXT);

        var mechanical = new MechanicalKeyboard();
        mechanical.setBrand("Razer");
        mechanical.setModel("Mechanical");
        mechanical.setSwitchType("Cherry MX Red");
        mechanical.displayInfo(MechanicalKeyboard.class.getName().toLowerCase());
        mechanical.typeText(TEXT);

        var regular = new RegularKeyboard();
        regular.setBrand("Dell");
        regular.setModel("KB216");
        regular.setHasNumericPad(true);
        regular.displayInfo(RegularKeyboard.class.getName().toLowerCase());
        regular.typeText(TEXT);

        var monitor = new Monitor();
        monitor.setBrand("LG");
        monitor.setModel("24MR400-B");
        monitor.setInches(23.8);
        monitor.setPrice(79.52);
        monitor.greetCustomer("Bill Wellington");

        var ledMonitor = new LEDMonitor();
        ledMonitor.setBrand("Samsung");
        ledMonitor.setModel("T35F");
        ledMonitor.setInches(24D);
        ledMonitor.setPrice(99.99);
        ledMonitor.greetCustomer("Gerry Khan");

        var jbl = new Earphone("JBL Tune Flex", "Blue", "4", false, "Tune Flex", 3_200_000D);
        System.out.println(jbl.getInformation());

        var samsung = new Earbuds("Samsung Earbuds Pro 4", "Black", "4", false, "Earbuds Pro 4", 5_000_000D, true);
        System.out.println(samsung.getInformation());

    }

}
