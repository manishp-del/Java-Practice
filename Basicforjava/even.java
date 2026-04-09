package Basicforjava;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num  =  sc.nextInt();
        if(num%2==0){
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }
    
}
