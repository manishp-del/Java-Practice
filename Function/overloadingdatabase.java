package Function;
import java.util.Scanner;

public class overloadingparam {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b, float c){
        return a+b+c;

    }

    

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a : ");
    int a = sc.nextInt();
    System.out.println("Enter b : ");
    int b = sc.nextInt();
    System.out.println("Enter c : ");
    int c = sc.nextInt();
    int result1 = sum(a, b);
    System.out.println("result1 is :" + result1);
    float result2 = sum(a, b, c);
    System.out.println("result2 is : "+  result2);
    

   
}
}
