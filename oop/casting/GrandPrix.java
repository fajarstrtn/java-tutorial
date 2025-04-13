
public class GrandPrix {

    public static void main(String[] args) {

        Tournament tournament;

        tournament = new Tournament();

        System.out.println(tournament instanceof Tournament); // true
        System.out.println(tournament instanceof F1); // false
        System.out.println(tournament instanceof FormulaE); // false
        System.out.println(tournament instanceof Object); // true

        tournament = new F1();

        System.out.println(tournament instanceof Tournament); // true
        System.out.println(tournament instanceof F1); // true
        System.out.println(tournament instanceof FormulaE); // false
        System.out.println(tournament instanceof Object); // true

        tournament = new FormulaE();

        System.out.println(tournament instanceof Tournament); // true
        System.out.println(tournament instanceof F1); // true
        System.out.println(tournament instanceof FormulaE); // true
        System.out.println(tournament instanceof Object); // true

    }

}

class Tournament {

}

class F1 extends Tournament {
}

class FormulaE extends F1 {
}
