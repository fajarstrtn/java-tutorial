
import java.util.function.Consumer;

public class CoffeeShop {

    public static void main(String[] args) {

        Consumer<CoffeeMachine> coffeeMachine = type -> {
            type.turnOn();
            // User cannot combine two pattern matches in one if, this is still illegal.
            // User must separate pattern matching or cast manually after checking.
            // For example (This can be wrong and illegal):
            // if (type instanceof CoffeeMachine.Brewer cmb && type instanceof CoffeeMachine.Cleaner cmc) {
            //     cmb.brew();
            //     cmc.clean();
            // }
            // 
            // Each instanceof pattern introduces one variable.
            // For example (good practice):
            if (type instanceof CoffeeMachine.Brewer brewer) {
                brewer.brew();
            }
            if (type instanceof CoffeeMachine.Cleaner cleaner) {
                cleaner.clean();
            }
            type.turnOff();
        };

        CoffeeMachine espresso = new EspressoMachine();
        coffeeMachine.accept(espresso);

        CoffeeMachine latte = new LatteMachine();
        coffeeMachine.accept(latte);

    }

}

abstract class CoffeeMachine {

    public interface Brewer {

        public void brew();

    }

    public interface Cleaner {

        public void clean();

    }

    public abstract void turnOn();

    public abstract void turnOff();

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
