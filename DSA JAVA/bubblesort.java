import java.util.*;
public class bubblesort {
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        bubblesort(arr);
        System.out.println("sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
