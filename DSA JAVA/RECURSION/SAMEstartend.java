import java.util.*;
public class SAMEstartend {
    public static int countsubstring(String str, int start, int end){
        //base case
        if(start == str.length()){
            return 0;
        }
        //move to next strarting position
        if(end == str.length()){
            return countsubstring(str, start+1, start+1);

        }
        //check current substring
        int count = 0;
        if(str.charAt(start) == str.charAt(end)){
            count = 1;
        }
        //check next ending position
        return count + countsubstring(str, start, end+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        int result = countsubstring(str, 0, 0);
        System.out.println("count =" + result);
        sc.close();
    }
    
}
