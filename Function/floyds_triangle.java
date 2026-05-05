package Function;
import java.util.Scanner;
public class floyds_triangle {
    public static void floyds_triangle(int n){
        //outer loop
        int counter = 1;
        for(int i=1;i<=n;i++){
            //inner loop(how many times will counter be printed)
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        floyds_triangle(n);
    }
    
}
