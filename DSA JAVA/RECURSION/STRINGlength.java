import java.util.*;
public class STRINGlength {
    public static int findlength(String str, int index){
        //base case
        if(index == str.length()){
            return 0;
        }
        //recursive call
        return 1 + findlength(str, index + 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int length = findlength(str, 0);
        System.out.println("Length of string is = " + length);
        sc.close();
        
    }
    
}
