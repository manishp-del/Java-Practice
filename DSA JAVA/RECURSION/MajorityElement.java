import java.util.*;

public class MajorityElement {

    public static int majorityElement(int arr[], int si, int ei) {

        // Base case
        if (si == ei) {
            return arr[si];
        }

        // Divide
        int mid = si + (ei - si) / 2;

        int left = majorityElement(arr, si, mid);
        int right = majorityElement(arr, mid + 1, ei);

        // If both sides give same majority
        if (left == right) {
            return left;
        }

        // Count left element
        int leftCount = count(arr, left, si, ei);

        // Count right element
        int rightCount = count(arr, right, si, ei);

        // Return the element with greater count
        return leftCount > rightCount ? left : right;
    }

    public static int count(int arr[], int key, int si, int ei) {

        int count = 0;

        for (int i = si; i <= ei; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = majorityElement(arr, 0, n - 1);

        System.out.println("Majority element = " + result);

        sc.close();
    }
}