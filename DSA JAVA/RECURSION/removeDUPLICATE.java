package RECURSION;
import java.util.*;
public class removeDUPLICATE {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
    // duplicate
    removeDuplicates(str, idx + 1, newStr, map);
    } else {
    map[currChar - 'a'] = true;
    removeDuplicates(str, idx + 1, newStr.append(currChar), map);

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:  ");
        String str = sc.next();
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        sc.close();

    }
    
}
