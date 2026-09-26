package ARRAYLISTS;
import java.util.ArrayList;
public class swap2numbers {
    public static void swap(ArrayList<Integer> List, int idx1, int idx2){
        int temp = List.get(idx2);
        List.set(idx2, List.get(idx1));
        List.set(idx1, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(7); //O(1)
        List.add(0);
        List.add(20);
        List.add(27);
        List.add(1);
        int idx1 = 1, idx2 = 3;
        System.out.println(List);
        swap(List, idx1, idx2);
        System.out.println(List);
    }
}

