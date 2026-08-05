package RECURSION;
import java.util.*;
public class firstOCCURENCE {
    public static int firstOCCURENCE(int arr[], int key, int i){
        if(i==arr.length){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return firstOCCURENCE(arr, key, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter key : ");
        int key = sc.nextInt();
        int ans = firstOCCURENCE(arr, key, 0);
        System.out.println(ans);

        sc.close();
    }
    
}
