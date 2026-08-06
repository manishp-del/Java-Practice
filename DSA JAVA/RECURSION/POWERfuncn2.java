package RECURSION;
import java.util.*;
public class POWERfuncn2 {
    public static int power(int x, int n){
        if(n==0){
            return 1;

        }
        return x * power(x, n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = sc.nextInt();
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println("ANSWER is : " + result);
    }
    
}
