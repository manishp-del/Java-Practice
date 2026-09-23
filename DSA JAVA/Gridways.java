import java.util.*;

public class Gridways {

    public static int Gridways(int i, int j, int n, int m) {

        // base case
        if(i == n-1 && j == m-1) {
            return 1;
        }

        // boundary cross condition
        else if(i == n || j == m) {
            return 0;
        }

        int w1 = Gridways(i+1, j, n, m);
        int w2 = Gridways(i, j+1, n, m);

        return w1 + w2;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();

        // Start from (0,0)
        int totalways = Gridways(0, 0, n, m);

        System.out.println("Total ways to reach destination = " + totalways);

        sc.close();
    }
}