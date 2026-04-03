
public class Label {

    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            System.out.println("First block");
            second:
            {
                System.out.println("Second block");
                third:
                {
                    System.out.println("Third block");
                    if (t) {
                        break second; // Jumping out to another label easily (it will jump out to the second label).
                    }
                    System.out.println("End of the third block");
                }
                System.out.println("End of the second block");
            }
            System.out.println("End of the first block");
        }
    }

}
