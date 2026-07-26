import java.util.*;
public class palindrome {
    public static boolean palindrome(String Str){
        for(int i=0; i<Str.length()/2; i++){
            int n = Str.length();
            if(Str.charAt(i) != Str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String Str = sc.nextLine();
        if(palindrome(Str)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not a palindrome");

        }
        sc.close();

    }

    
}
