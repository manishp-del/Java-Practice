package Basicforjava;
import java.util.Scanner;

public class  generalisecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        System.out.println("Enter b:");
        float b = sc.nextFloat();
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;

        }
    }
    
}
