package RECURSION;
import java.util.*;
public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;

        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;

    }
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = sc.nextInt();
    int ans = fib(n);
    System.out.println(ans);
}    
}
