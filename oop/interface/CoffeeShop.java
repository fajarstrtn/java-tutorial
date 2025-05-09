
import java.util.function.Consumer;

public class CoffeeShop {

    private static void serve(
            CoffeeMachine type,
            Consumer<CoffeeMachine> on,
            Consumer<CoffeeMachine.Brewer> brewer,
            Consumer<CoffeeMachine.Cleaner> cleaner,
            Consumer<CoffeeMachine> off
    ) {
        on.accept(type);

        // You cannot combine two pattern matches in one if, this is still illegal.
        // You must separate pattern matching or cast manually after checking.
        // For example (This can be wrong and illegal):
        // if (type instanceof CoffeeMachine.Brewer cmb && type instanceof CoffeeMachine.Cleaner cmc) {
        //     cmb.brew();
        //     cmc.clean();
        // }
        // 
        // Each instanceof pattern introduces one variable.
        // For example (good practice):
        if (type instanceof CoffeeMachine.Brewer val) {
            brewer.accept(val);
        }

        // Check if 'type' object is a Cleaner, then bind it to val. 
        if (type instanceof CoffeeMachine.Cleaner val) {
            cleaner.accept(val);
        }

        off.accept(type);
    }

    public static void main(String[] args) {
        Consumer<CoffeeMachine> on = CoffeeMachine::turnOn;
        Consumer<CoffeeMachine> off = CoffeeMachine::turnOff;

        Consumer<CoffeeMachine.Brewer> brewer = CoffeeMachine.Brewer::brew;
        Consumer<CoffeeMachine.Cleaner> cleaner = CoffeeMachine.Cleaner::clean;

        var espresso = new EspressoMachine();
        var latte = new LatteMachine();

        serve(espresso, on, brewer, cleaner, off);
        serve(latte, on, brewer, cleaner, off);
    }

}

abstract class CoffeeMachine {

    public abstract void turnOn();

    public abstract void turnOff();

    public interface Brewer {

        public void brew();
    }

    public interface Cleaner {

        public void clean();
    }

}

class EspressoMachine extends CoffeeMachine implements CoffeeMachine.Brewer, CoffeeMachine.Cleaner {

    @Override
    public void turnOn() {
        System.out.println("Turning on espresso machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off espresso machine...");
    }

    @Override
    public void brew() {
        System.out.println("Brewing a strong espresso...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning up espresso machine...");
    }

}

class LatteMachine extends CoffeeMachine implements CoffeeMachine.Brewer, CoffeeMachine.Cleaner {

    @Override
    public void turnOn() {
        System.out.println("Turning on latte machine...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off latte machine...");
    }

    @Override
    public void brew() {
        System.out.println("Brewing a creamy latte...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning up latte machine...");
    }

}
