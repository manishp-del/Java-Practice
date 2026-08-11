import java.util.*;

public class QUICKSORT {

    public static void divideconquer(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Partition
        int pIdx = partition(arr, si, ei);

        // Left part
        quicksort(arr, si, pIdx - 1);

        // Right part
        quicksort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {

                i++;

                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Put pivot in correct position
        i++;

        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
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

        System.out.println("Original array:");
        divideconquer(arr);

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        divideconquer(arr);

        sc.close();
    }
}