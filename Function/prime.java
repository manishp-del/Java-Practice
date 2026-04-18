package Function;
import java.util.Scanner;
public class prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isPrime = false;
            break;
            
        }
    }
    return isPrime;

}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        boolean result = isPrime(n); 
        System.out.println("The prime no.. is : " + result);
    
    }
}

