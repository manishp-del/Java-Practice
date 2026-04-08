package Basicforjava;
import java.util.Scanner;
public class thermometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a body temp:");
        float temp = sc.nextFloat();
        if(temp>100 && temp<103.5){
            System.out.println("The person has fever :");


        }
        else if(temp >103.5){
            System.out.println("The person has high fever:");
        }
        else if(temp<=100) {
            System.out.println("The person has no fever :");
        }
        else{
            System.out.println("The person is normal: ");
        }

    }
    
}
