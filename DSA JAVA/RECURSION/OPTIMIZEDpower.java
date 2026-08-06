package RECURSION;
import java.util.*;

public class OPTIMIZEDpower {

    public static int optimisedpower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        int halfPower = optimisedpower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Power = " + optimisedpower(a, n));

        sc.close();
    }
}