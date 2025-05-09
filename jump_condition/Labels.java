
public class Labels {

    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            System.out.println("Start of first block.");
            second:
            {
                System.out.println("Start of second block.");
                third:
                {
                    System.out.println("Start of third block.");
                    // To jump out of a label easily (In this case, it will jump out of second label).
                    if (t) {
                        break second;
                    }
                    System.out.println("End of third block.");
                }
                System.out.println("End of second block.");
            }
            System.out.println("End of first block.");
        }
    }

}
