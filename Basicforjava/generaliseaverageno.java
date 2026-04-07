package Basicforjava;
import java.util.Scanner;
public class generaliseaverageno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        float sum = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the no. "+(i+1)+":");
            float x = sc.nextFloat();
            sum = sum + x;
            float average = sum/n;
            System.out.println("The average is: " + average);
        }
    }

    
}
