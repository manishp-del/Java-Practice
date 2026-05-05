package Function;
import java.util.Scanner;

public class inverted_rotated_half_pyramid {
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //move to the next line
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        inverted_rotated_half_pyramid(n);
        sc.close();
    }
    
}
