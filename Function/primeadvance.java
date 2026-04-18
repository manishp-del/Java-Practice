package Function;

import java.util.Scanner;

public class primeadvance {
    public static boolean isprime(int n){
        if(n==2){
            return true;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
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
        boolean result = isprime(n); 
        System.out.println("The prime no.. is : " + result);
    
    }

    
}
