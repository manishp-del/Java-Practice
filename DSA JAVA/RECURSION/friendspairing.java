package RECURSION;
import java.util.*;

public class friendspairing {
    public static int friendspairing(int n){
        //best case
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendspairing(n-1);
        //pair
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1)*fnm2;
        //totways
        int totways = fnm1 + pairways;
        return totways;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        System.out.println("total ways = " + friendspairing(n));
    }
    
}
