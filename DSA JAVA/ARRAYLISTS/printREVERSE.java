package ARRAYLISTS;
import java.util.ArrayList;
public class printREVERSE {
    

    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1); //O(1)
        List.add(2);
        List.add(3);
        List.add(4);

        //reverse print
        for(int i=List.size() - 1; i>=0; i--){
            System.out.print(List.get(i) + " ");

        }
        
        System.out.println();
    }
}

    

