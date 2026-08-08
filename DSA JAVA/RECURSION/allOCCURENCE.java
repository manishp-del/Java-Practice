import java.util.*;
public class allOCCURENCE {
    public static void findoccurence(int arr[], int key, int i){
        //base case
        if(i==arr.length){
            return;
        }
        //work
        if(arr[i]==key){
            System.out.println("key found at index : " + i);
        }

        //recursive call
        findoccurence(arr, key, i+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements :");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter key: ");
        int key = sc.nextInt();
        System.out.println("occurence of" + key + "are :");
        findoccurence(arr, key, 0);
        sc.close();
            
        }} 
    
    

