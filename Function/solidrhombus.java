package Function;
import java.util.Scanner;

public class solidrhombus {
    public static void solidrhombus(int n){

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        solidrhombus(n);
        sc.close();
        
    }
    
}
