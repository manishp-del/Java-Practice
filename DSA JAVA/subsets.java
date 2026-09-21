import java.util.Scanner;
public class subsets {
    public static void subsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        subsets(str, ans+str.charAt(i), i+1);
        //no choice
        subsets(str, ans, i+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        subsets(str, " ", 0);
        //total number of subsets = 2^n
        int total = (int) Math.pow(2, str.length());
        System.out.println("total subsets = " + total);
        sc.close();

    }
    
}
