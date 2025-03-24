
public class Score {

    public static void main(String[] args) {

        calculatePoints();
        int loseScore = calculatePoints("Manchester United", "Chelsea", true);
        int drawScore = calculatePoints("Bayern Munich", "FC Barcelona");
        int winScore = calculatePoints("Liverpool", "AS Roma", (byte) 4);

        System.out.println(loseScore + " point(s) for Manchester United");
        System.out.println(drawScore + " point(s) for Bayern Munich");
        System.out.println(winScore + " point(s) for Liverpool");

    }

    private static void calculatePoints() {

        System.out.println("No team scores a goal");

    }

    private static int calculatePoints(String teamA, String teamB, boolean isFailedToTheNextRound) {

        System.out.println(teamA + " bows out of " + teamB);
        if (isFailedToTheNextRound) {
            System.out.println(teamA + " is failed to the next round");
        } else {
            System.out.println(teamA + " still make it to the next round");
        }
        return 0;

    }

    private static int calculatePoints(String teamA, String teamB) {

        System.out.println(teamA + " draws against " + teamB);
        return 1;

    }

    private static int calculatePoints(String teamA, String teamB, byte goal) {

        System.out.println(teamA + " scores " + goal + " goal(s) againts " + teamB);
        return 3;

    }

}
