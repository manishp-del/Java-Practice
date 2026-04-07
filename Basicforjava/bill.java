package Basicforjava;
import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        System.out.print("enter the cost of pen:");
        float pen = sc.nextFloat();

        float total = pencil+eraser+pen;

        float gst = total*0.18f;
        float finalBill = total+gst;

        System.out.println("total bill = " + total);
        System.out.println("final bill with gst = " + finalBill) ;

        sc.close();
    }
}
    

