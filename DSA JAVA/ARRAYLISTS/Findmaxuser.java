package ARRAYLISTS;
import java.util.ArrayList;
import java.util.*;

public class Findmaxuser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>List = new ArrayList<>();
        System.out.println("Enter number of  elements :");
        int n = sc.nextInt();
        System.out.println("Enter " + n + "elements :");
        for(int i=0; i<n; i++){
            List.add(sc.nextInt());

        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<List.size(); i++){
            if(max < List.get(i)){
                max = List.get(i);
            }
        }
        System.out.println("Max element = " + max);
        sc.close();
    }

    
}
