package Function;
import java.util.Scanner;

public class diamondstar {
    //1st half
    public static void diamondstar(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
                
            }
            System.out.println();

            
        }
        //2nd hald

        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
                
            }
            System.out.println();

        }

    }        
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        diamondstar(n);
    }
     
        
    
}



