import java.util.*;

public class LetterCombinations {

    static String keypad[] = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void combinations(String digits, int index, String ans) {

        // Base case
        if (index == digits.length()) {
            System.out.print(ans + " ");
            return;
        }

        // Current digit
        char curr = digits.charAt(index);

        // Convert character digit to integer
        int number = curr - '0';

        // Get letters
        String letters = keypad[number];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            combinations(digits, index + 1, ans + ch);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.next();

        combinations(digits, 0, "");

        sc.close();
    }
}