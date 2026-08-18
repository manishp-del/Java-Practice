import java.util.*;
public class findSUBSETS {
    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findsubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        findsubsets(str, "", 0);
        sc.close();


    }
    
}
