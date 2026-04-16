package Function;
import java.util.Scanner;
public class binomialcoeff {
    public static int factorial(int x){
        int fact = 1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n /(fact_r * fact_nmr);
        return bincoeff;

    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n = sc.nextInt();
    System.out.println("Enter r :");
    int r = sc.nextInt();
    int result = bincoeff(n, r);

    System.out.println("Binomial coefficient is :" + result);

}
    
}
