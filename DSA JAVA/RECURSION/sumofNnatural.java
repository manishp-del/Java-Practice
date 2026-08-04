package RECURSION;
import java.util.*;

public class sumofNnatural {
    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        int sum1 = calcsum(n-1);
        int sum = n + sum1;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int ans = calcsum(n);
        System.out.println(ans);
    }
    
}
