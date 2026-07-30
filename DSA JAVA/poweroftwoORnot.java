import java.util.*;
public class poweroftwoORnot {
    public static boolean isPoweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.println(isPoweroftwo(n));
        sc.close();

    }
    
}
