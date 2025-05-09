
public class StudentIndex {

    private static long calculateScore(String firstName, int finalScore) {
        System.out.println(String.format("Hello! My name is %s.", firstName));
        finalScore *= 10;
        return finalScore;
    }

    private static int getPosition(long finalScore) {
        int position = 5;

        if (finalScore >= 900 && finalScore <= 1000) {
            return 1;
        } else if (finalScore >= 800 && finalScore < 900) {
            return 2;
        } else if (finalScore >= 700 && finalScore < 800) {
            return 3;
        }

        return position;
    }

    public static void main(String[] args) {
        long result = calculateScore("Harry", 50);
        System.out.println("Final score is " + result + ".");

        int position = getPosition(result);
        System.out.println("My position is " + position + ".");
    }

}
