package Basicforjava;
import java.util.Scanner;
public class starprintNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr no. of row:" );
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.println("*");

            }
        }
        
    }}
    

