import java.util.*;

public class findPERMUTATION {

    public static void permutation(String str, String ans) {

        // Base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Remove current character
            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutation(newStr, ans + curr);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        permutation(str, "");

        sc.close();
    }
}