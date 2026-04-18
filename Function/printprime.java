package Function;
import java.util.Scanner;
public class printprime {
    public static boolean primeinrange(int n){
        boolean isprime = true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = sc.nextInt();
    boolean result = isprime(n); 
    System.out.println("The prime no.. is : " + result);
    }
}
