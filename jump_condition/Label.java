
public class Label {

    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            System.out.println("Start of first block");
            second:
            {
                System.out.println("Start of second block");
                third:
                {
                    System.out.println("Start of third block");
                    if (t) {
                        break second; // Jumping out to another label easily (it will jump out to the second label).
                    }
                    System.out.println("End of third block");
                }
                System.out.println("End of second block");
            }
            System.out.println("End of first block");
        }
    }

}
