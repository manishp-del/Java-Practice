import java.util.*;
public class checkEVENorODD {
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            //even
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        oddoreven(n);
        sc.close();

    }
    
}
