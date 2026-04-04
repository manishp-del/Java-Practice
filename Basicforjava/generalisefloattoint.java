package Basicforjava;
import java.util.Scanner;


public class generalisefloattoint {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number:");
        float number = sc.nextFloat();
        int number2 = (int)number;
        System.out.println("THE INTEGER VALUE OF THE FLOAT NUMBER IS :" +number2);
    sc.close();

    }
    
}
