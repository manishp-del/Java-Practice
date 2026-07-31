import java.util.*;
public class fastexponentiation {
    public static int fastexpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                //check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;

        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.println(fastexpo(a, n));
        sc.close();
        
    }
    
}
