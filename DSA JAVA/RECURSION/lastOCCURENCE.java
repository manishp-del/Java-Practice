package RECURSION;
import java.util.*;

public class lastOCCURENCE {
    public static int lastOCCURENCE(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        int isFound = lastOCCURENCE(arr, key,  i+1);
        if(isFound == -1 && arr[i] ==key){
            return i;
        }
        return isFound;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter key: ");
        int key = sc.nextInt();
        int result = lastOCCURENCE(arr, key, 0);
        System.out.println("last occurence = " + result);
    }

}

