package OOPS;
import java.util.*;


public class methodoverloading {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        System.out.println("Enter b: ");
        float b = sc.nextFloat();
        System.out.println("Enter c :");
        float c = sc.nextFloat();
        System.out.println("sum of a and b is = " + calc.sum(a, b));
        System.out.println("sum of a, b and c is = " + calc.sum(a, b, c));
        sc.close();


    }
    
}
class calculator{
    int sum(int a, int b){
        return a+b;

    }
    float sum(float a, float b){
        return a+b;
    }
    float sum(float a , float b, float c){
        return a+b+c;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
