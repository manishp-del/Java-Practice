import java.util.*;
public class countsetbit {
    public static int countSetbit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                //check our LSB
                count++;


            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(countSetbit(n));
        sc.close();

    }

    
}
