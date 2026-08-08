import java.util.*;
public class printBinarystring2 {
    public static void printBinarystring(int n, int lastplace, StringBuilder str){
        //base case
        if(n==0){
            System.out.println(str);
            return;

        }
        //kaam
        printBinarystring(n-1, 0, new StringBuilder(str).append("0"));
        if(lastplace == 0){
            printBinarystring(n-1, 1, new StringBuilder(str).append("1"));

        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        printBinarystring(n, 0, new StringBuilder());
        sc.close();


    }
    
}
