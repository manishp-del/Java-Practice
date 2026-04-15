package Function;
import java.util.*;
public class callbyvalueswap {
    public static int calculatesum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        // swap - exchange value
        int a = 5;
        int b = 10;
        System.out.println("before swap  a=" + a + ", b=" + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap  a=" + a + ", b=" + b);
    }
}
