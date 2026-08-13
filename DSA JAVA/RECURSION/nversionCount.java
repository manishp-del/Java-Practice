import java.util.*;

public class nversionCount {

    public static int merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        int invCount = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } 
            else {
                temp[k++] = arr[j++];

                // All remaining elements in left part
                // will form inversions
                invCount += (mid - i + 1);
            }
        }

        // Remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining right elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp into original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    public static int mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return 0;
        }

        int mid = si + (ei - si) / 2;

        int leftInv = mergeSort(arr, si, mid);
        int rightInv = mergeSort(arr, mid + 1, ei);

        int mergeInv = merge(arr, si, mid, ei);

        return leftInv + rightInv + mergeInv;
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

        int result = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversion count = " + result);

        sc.close();
    }
}