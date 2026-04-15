package Function;
import java.util.Scanner;

public class generaliseproduct {
    public static int product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int ans = product(a, b);
        System.out.println(ans);
        
    }}


