import java.util.*;
public class backtrecking{
    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //kaam(recursion)
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] -2;

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
        }
    
    System.out.println();
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of elements : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements : ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();

    }
    System.out.println("original array: ");
    printArr(arr);
    changeArr(arr, 0, 1);
    System.out.println("Array after backtrecking : ");
    printArr(arr);
    sc.close();
        
    }}

    
