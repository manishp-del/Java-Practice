import java.util.*;
public class permutation {
    public static void permutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n * factorial(n-1);


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.next();
        permutation(str, "");
        //print all permutation
        int count = factorial(str.length());
        System.out.println("total permutation = " + count);
        sc.close();
    }
    
}
