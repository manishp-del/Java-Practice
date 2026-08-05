package RECURSION;
import java.util.*;
public class checkIFarraySORTED {
    public static boolean issorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = issorted(arr, 0);
        System.out.println(ans);
        }

    }
    

