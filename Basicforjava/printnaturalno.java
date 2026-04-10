package Basicforjava;
import java.util.Scanner;

public class printnaturalno {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 1;
        while(counter <=n){
            System.out.println(counter );
            counter++;
        }

    }
}
