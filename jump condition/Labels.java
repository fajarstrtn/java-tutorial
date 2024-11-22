
public class Labels {

    public static void main(String[] args) {

        boolean t = true;

        first:
        {
            System.out.println("start of first block");

            second:
            {
                System.out.println("start of second block");

                third:
                {
                    System.out.println("start of third block");

/*                  To jump out of a label easily (in this case, it will jump out of second label). */
                    if (t) {
                        break second;
                    }
                    System.out.println("end of third block");
                }

                System.out.println("end of second block");
            }

            System.out.println("end of first block");
        }
        
    }
}
