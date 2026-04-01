
public class Match {

    private static void matchUp() {
        System.out.println("No team scores a goal");
    }

    private static int matchUp(String teamA, String teamB, boolean isFailedToTheNextRound) {
        System.out.println(teamA + " bows out of " + teamB);
        if (isFailedToTheNextRound) {
            System.out.println(teamA + " is failed to the next round");
        } else {
            System.out.println(teamA + " still make it to the next round");
        }
        return 0;
    }

    private static int matchUp(String teamA, String teamB) {
        System.out.println(teamA + " draws against " + teamB);
        return 1;
    }

    private static int matchUp(String teamA, String teamB, byte goal) {
        System.out.println(teamA + " scores " + goal + " goal(s) against " + teamB);
        return 3;
    }

    public static void main(String[] args) {
        int score;

        matchUp();

        score = matchUp("Manchester United", "Chelsea", true);
        System.out.println(score + " point(s) for Manchester United");

        score = matchUp("Bayern Munich", "FC Barcelona");
        System.out.println(score + " point(s) for Bayern Munich");

        score = matchUp("Liverpool", "AS Roma", (byte) 4);
        System.out.println(score + " point(s) for Liverpool");
    }

}
