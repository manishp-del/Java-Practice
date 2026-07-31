import java.util.*;
public class modularexpo {
    public static long modularexpo(long a, long n, long m){
        long ans = 1;
        a = a % m;
        while(n>0){
            if((n&1)!=0){
                ans = (ans * a) % m;
            }
            a = (a*a) % m;
            n = n>>1;

        }
        return ans;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (a) :");
        long a = sc.nextLong();
        System.out.print("Enter exponent (n) : ");
        long n = sc.nextLong();
        System.out.print("Enter modulus (m): ");
        long m = sc.nextLong();
        System.out.println("Result = " + modularexpo(a, n, m));
        sc.close();
        

    }
    
}
