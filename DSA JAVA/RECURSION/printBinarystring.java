import java.util.*;

public class printBinarystring {

    public static void printBinarystring(int n, int lastPlace, String str) {

        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Place 0
        printBinarystring(n - 1, 0, str + "0");

        // Place 1 only if previous digit is 0
        if (lastPlace == 0) {
            printBinarystring(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printBinarystring(n, 0, "");

        sc.close();
    }
}