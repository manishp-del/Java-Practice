package Basicforjava;
import java.util.Scanner;

public class adultusingconditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age =  sc.nextInt();
        if(age>=18){
            System.out.println("you r an adult ");
        }
        if(age>=13 && age<18){
            System.out.println("you r teenager");

        }
        else{
            System.out.println("you r child");
        }
    }
    
}
