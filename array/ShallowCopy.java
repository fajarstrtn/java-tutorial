
public class ShallowCopy {

    public static void main(String[] args) {

        int[][] mdArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] mdArrayReplica = mdArray.clone();

        mdArrayReplica[0][1] = 100;

        System.out.println(mdArray == mdArrayReplica);
        System.out.println(mdArray[0] == mdArrayReplica[0]);
        System.out.println(mdArray[1] == mdArrayReplica[1]);
        System.out.println(mdArray[0][1] == mdArrayReplica[0][1]);
        
    }
}
