import java.util.*;

public class Stringmergesort {

    // Merge two sorted parts
    public static void merge(String arr[], int si, int mid, int ei) {

        String temp[] = new String[ei - si + 1];

        int i = si;       // left part
        int j = mid + 1;  // right part
        int k = 0;        // temp array

        while(i <= mid && j <= ei) {

            if(arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } 
            else {
                temp[k++] = arr[j++];
            }
        }

        // Remaining left elements
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining right elements
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Merge Sort
    public static void mergesort(String arr[], int si, int ei) {

        // Base case
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Left part
        mergesort(arr, si, mid);

        // Right part
        mergesort(arr, mid + 1, ei);

        // Merge
        merge(arr, si, mid, ei);
    }

    // Print array
    public static void printArray(String arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        String arr[] = new String[n];

        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Original array:");
        printArray(arr);

        mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}