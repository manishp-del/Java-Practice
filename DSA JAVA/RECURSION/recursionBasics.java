package RECURSION;
import java.util.*;
public class recursionBasics {
    
    public static void printDecreasing(int n){
        
        if(n==1){
            System.out.print(n);
        return;
    }
    System.out.print(n +" ");
    printDecreasing(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
    
}

