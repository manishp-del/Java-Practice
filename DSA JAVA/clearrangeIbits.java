import java.util.*;
public class clearrangeIbits {

    
     public static int clearrangeIbit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
       
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter i : ");
            int i = sc.nextInt();
            System.out.print("enter j : ");
            int j = sc.nextInt();
            int result = clearrangeIbit(n, i, j);
            System.out.println("updated number = " + result);
            sc.close();
            
        }
     }

     
    


    

