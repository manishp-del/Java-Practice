import java.util.*;
public class SORTEDANDROTATES {
    public static int search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2;  //(si+ei)/2
        //case found
        if(arr[mid] == tar){
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid);
            }
            else{
                //case b: right
                return search(arr, tar, mid+1, ei);
            }
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, si, mid-1);


            }else{
            //case d: left
            return search(arr, tar, si, mid - 1);

            }
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter sorted and rotated array elements : ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }   
        System.out.println("enter target : ");
        int tar = sc.nextInt();

        int result = search(arr, tar, 0, arr.length-1);
        if(result == -1){
            System.out.println("target not found");
        }
        else{
            System.out.println("target found at index :" + result);
        }
        sc.close();

        }
    }
    
}
