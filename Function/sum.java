package Function;
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        sum();

    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is : "  + sum);


    }
    
    
}
