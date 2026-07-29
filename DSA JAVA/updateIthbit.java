import java.util.*;
public class updateIthbit {
    public static int clearIthbit(int n, int i){
        int bitMask = ~(1 << i);
            return n & bitMask;

        }
    public static int setIthbit(int n, int i){
        int bitMask = (1 << i);
        return n | bitMask;

    }

    
     public static int updateIthbit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthbit(n, i);

        }
        else{
            return setIthbit(n, i);
        }
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter i : ");
            int i = sc.nextInt();
            System.out.print("enter newBit(0 or 1): ");
            int newBit = sc.nextInt();
            int result = updateIthbit(n, i, newBit);
            System.out.println("updated number = " + result);
            sc.close();
            
        }
     }

     
    

