
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class collectioninbuiltreverse  {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, java.util.Collections.reverseOrder());
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]  + " ");
        }
    }
}