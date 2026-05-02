package Function;
import java.util.Scanner;
public class primeall {
    public static boolean isPrime(int n){
      
        if(n<2)return false;
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
        if(n%i==0){
            
            return false;
            
        }
    }
    return true;

}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("prime numbers are :");
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");

            }
        }
        sc.close();
    
    }
}

