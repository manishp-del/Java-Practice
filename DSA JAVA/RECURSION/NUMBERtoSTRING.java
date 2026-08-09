import java.util.*;
public class NUMBERtoSTRING {
    static String digits[] = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    public static void printDigits(int num){
        //base case
        if(num == 0){
            return;

        }
        //recursive call
        printDigits(num/10);
        //work
        int lastDigits = num%10;
        System.out.print(digits[lastDigits]+" ");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("zero");

        }
        else{printDigits(number);

        }
        sc.close();
    }
    
}

