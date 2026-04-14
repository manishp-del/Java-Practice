package Basicforjava.Function;
import java.util.Scanner;
public class returnsum {
    public static void main(String[] args){
        int ans = sum2();
        System.out.println(ans);

    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        return a+b;
    }
        static void returnsum(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b:");
            int b = sc.nextInt();
            int returnsum = a+b;
        }


    }
    
    

