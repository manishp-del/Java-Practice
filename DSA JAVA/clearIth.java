import java.util.*;
public class clearIth {
    public static int clearIth(int n, int i){

        int bitMask = ~(1<<i);
        return n & bitMask;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter i : ");
        int i = sc.nextInt();
        System.out.println("the"+ i + "the bit is : " + clearIth(n, i));
        
    }


}
   
