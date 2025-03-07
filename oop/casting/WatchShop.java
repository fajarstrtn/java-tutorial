
public class WatchShop {

    public static final String DELIMETER = "==============================";

    public static void main(String[] args) {

        Watch watch = new Watch();
        drawLineAt(9);
        watch.makeSound();

        /* Upcasting object. */
        watch = new DressWatch();
        drawLineAt(14);
        watch.makeSound();
        /* watch.inform(); not allowed since method inform is specific to DressWatch class.*/
        if (watch instanceof DressWatch dw) {
            drawLineAt(18);
            dw.makeSound();
            dw.inform();
        }

        /* Downcasting object. */
        DressWatch dressWatch = (DressWatch) watch;
        drawLineAt(25);
        dressWatch.makeSound();
        dressWatch.inform();

        /* Upcasting object. */
        watch = new QuartzWatch();
        drawLineAt(31);
        watch.makeSound();

        /* Performing type-checking. */
        if (watch instanceof QuartzWatch qw) {
            drawLineAt(36);
            qw.makeSound();
            qw.inform();
        }

        watch = null;
        drawLineAt(42);
        System.out.println(watch);

    }

    private static void drawLineAt(int lineAt) {
        System.out.println(lineAt + ": " + DELIMETER);
    }

}

class Watch {

    public void makeSound() {
        System.out.println("tick... tick... tick...");
    }

}

class DressWatch extends Watch {

    @Override
    public void makeSound() {
        System.out.println("click... clack... click...");
    }

    public void inform() {
        System.out.println("this is a dress watch");
    }

}

class QuartzWatch extends Watch {

    public void inform() {
        System.out.println("this is a quartz watch");
    }

}
