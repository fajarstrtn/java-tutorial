
public class Universe {

    public static void main(String[] args) {
        var planet = new Planet();
        planet.revolve();
    }

}

interface revolveOne {

    default void revolve() {
        System.out.println("revolveOne is called...");
    }

}

interface revolveTwo {

    default void revolve() {
        System.out.println("revolveTwo is called...");
    }

}

class Planet implements revolveOne, revolveTwo {

    @Override
    public void revolve() {
        // Since both revolveOne and revolveTwo provide a default method show(),
        // class Planet must override it explicitly. Using revolveOne.super.show();, it invokes show() from interface A.
        revolveOne.super.revolve();
    }

}
