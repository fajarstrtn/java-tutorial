
public class StudentIndex {

    private static long calculateScore(String firstName, int finalScore) {
        System.out.println(String.format("Hello! My name is %s", firstName));
        finalScore *= 10;
        return finalScore;
    }

    private static int getPosition(long finalScore) {
        int position;
        if (finalScore >= 900 && finalScore <= 1000) {
            position = 1;
        } else if (finalScore >= 800 && finalScore < 900) {
            position = 2;
        } else if (finalScore >= 700 && finalScore < 800) {
            position = 3;
        } else {
            position = 0;
        }
        return position;
    }

    public static void main(String[] args) {
        long result = calculateScore("John Doe", 50); // Output: Hello! My name is John Doe
        int position = getPosition(result);

        System.out.println(position); // Output: 0
    }

}
