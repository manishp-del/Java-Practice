package ARRAYLISTS;

import java.util.ArrayList;
import java.util.Collections;
public class sortingCOLLECTION {
    public static void main(String args[]){
        //calssname objectname = new calssoom();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        List.add(7); //O(1)
        List.add(1);
        List.add(9);
        List.add(0);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
    }
    
}
