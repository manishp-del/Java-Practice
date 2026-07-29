import java.util.*;
public class setIthbit {
    public static int setIthbit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter i: ");
        int i = sc.nextInt();
        System.out.println("the" + i + "th bit is : " + setIthbit(n, i));
    }

    }
    

