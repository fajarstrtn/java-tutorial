
public class WatchShop {

    public static final String DELIMETER = "==============================";

    private static void drawLineAt(int lineAt) {
        System.out.println(lineAt + ": " + DELIMETER);
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        drawLineAt(9);
        watch.makeSound();

        // Upcasting object.
        watch = new DressWatch();
        drawLineAt(14);
        watch.makeSound();

        // watch.inform(); not allowed since method inform is specific to DressWatch class.
        if (watch instanceof DressWatch tmp) {
            drawLineAt(18);
            tmp.makeSound();
            tmp.inform();
        }

        // Downcasting object.
        DressWatch dressWatch = (DressWatch) watch;
        drawLineAt(25);
        dressWatch.makeSound();
        dressWatch.inform();

        // Upcasting object.
        watch = new QuartzWatch();
        drawLineAt(31);
        watch.makeSound();

        // Performing type-checking.
        if (watch instanceof QuartzWatch tmp) {
            drawLineAt(36);
            tmp.makeSound();
            tmp.inform();
        }

        watch = null;
        drawLineAt(42);
        System.out.println(watch);
    }

}

class Watch {

    public void makeSound() {
        System.out.println("Tick... Tick... Tick...");
    }

}

class DressWatch extends Watch {

    @Override
    public void makeSound() {
        System.out.println("Click... Clack... Click...");
    }

    public void inform() {
        System.out.println("This is a dress watch.");
    }

}

class QuartzWatch extends Watch {

    public void inform() {
        System.out.println("This is a quartz watch.");
    }

}
