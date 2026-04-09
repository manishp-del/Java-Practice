package Basicforjava;
import java.util.Scanner;
public class incometaxcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income:");
        float income = sc.nextFloat();
        if(income<500000){
            System.out.println("0% tax");

        }
        else if(income>=500000 && income<1000000){
            System.out.println("20% tax");
        }
        else if(income>=1000000){
            System.out.println("30% tax");
        }
            
        }
    }
    

