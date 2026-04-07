package Basicforjava;
import java.util.Scanner;

public class average3no {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        float a = sc.nextFloat();
        System.out.println("Enter second no:");
        float b = sc.nextFloat();
        System.out.println("Enter third no:");
        float c = sc.nextFloat();
        float average = (a+b+c)/3;
        System.out.println(average);



    }
    
}

    

