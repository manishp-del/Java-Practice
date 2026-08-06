package RECURSION;
import java.util.*;
public class tilling {
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam 
        //verical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println(n);

    }

    
}
