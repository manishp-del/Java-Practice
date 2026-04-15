package Function;
import java.util.Scanner;

public class generaliseswapping {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("before swapping a : " + a);
        System.out.println("before swapping b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a :" + a);
        System.out.println("after swapping b :" + b);

    }
}
