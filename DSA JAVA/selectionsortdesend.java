import java.util.Scanner;
public class selectionsortdesend {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n-1;i++){
            int maxIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the first element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Array after descending selection sort:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
