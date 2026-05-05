package Function;
import java.util.Scanner;
public class half_pyramidwithno {
    public static void half_pyramidwithno(int n){
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");

            }
            System.out.println();



        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        half_pyramidwithno(n);
    }
}
