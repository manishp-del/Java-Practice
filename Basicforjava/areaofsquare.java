package Basicforjava;
import java.util.Scanner;
public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square:");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("The area of a square is:" + area);


    }
    
}
