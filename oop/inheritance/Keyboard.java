
public class Keyboard {

    private String brand;
    private String model;

    public Keyboard() {
    }

    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayInfo(String classType) {
        System.out.println("This is " + classType + " class.");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public void typeText(String text) {
        System.out.println("Your text on keyboard is \"" + text + "\".");
    }

}

class MechanicalKeyboard extends Keyboard {

    private String switchType;

    public MechanicalKeyboard() {
        super();
    }

    public MechanicalKeyboard(String switchType) {
        this.switchType = switchType;
    }

    public MechanicalKeyboard(String switchType, String brand, String model) {
        super(brand, model);
        this.switchType = switchType;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    @Override
    public void displayInfo(String classType) {
        super.displayInfo(classType);
        System.out.println("Switch Type: " + switchType);
    }

    @Override
    public void typeText(String text) {
        System.out.println("Your text on mechanical keyboard is \"" + text + "\".");
    }

}

class RegularKeyboard extends Keyboard {

    private Boolean hasNumericPad;

    public RegularKeyboard() {
        super();
    }

    public RegularKeyboard(Boolean hasNumericPad) {
        this.hasNumericPad = hasNumericPad;
    }

    public RegularKeyboard(Boolean hasNumericPad, String brand, String model) {
        super(brand, model);
        this.hasNumericPad = hasNumericPad;
    }

    public Boolean getHasNumericPad() {
        return hasNumericPad;
    }

    public void setHasNumericPad(Boolean hasNumericPad) {
        this.hasNumericPad = hasNumericPad;
    }

    @Override
    public void displayInfo(String classType) {
        super.displayInfo(classType);
        System.out.println("Numeric Pad: " + hasNumericPad);
    }

    @Override
    public void typeText(String text) {
        System.out.println("Your text on regular keyboard is \"" + text + "\".");
    }

}
