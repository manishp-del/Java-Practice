package Function;
import java.util.Scanner;
import java.lang.Math;

public class binarytodeci {
    public static void binarytodeci(int binNum){
    int pow = 0;
    int decNum = 0;
    int original = binNum;

    while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum += lastDigit * (int)Math.pow(2, pow);
        pow++;
        binNum = binNum / 10;
    }

    System.out.println("decimal of " + original + " = " + decNum);
}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter binary number :");
            int binNum = sc.nextInt();
            binarytodeci(binNum);
        }
        
    
}

    

