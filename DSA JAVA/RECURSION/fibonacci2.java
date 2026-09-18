import java.util.*;
public class fibonacci2 {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);



    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        System.out.println("first" + n + "fibonacci number :");
        for (int i=0; i<n; i++){
            System.out.print(fibonacci(i)+ " ");

            
        }
    sc.close();
}
 
    }
    

