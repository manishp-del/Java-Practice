package ARRAYLISTS;

import java.util.ArrayList;

public class sizeOFarraylist {

    public static void main(String args[]){
        //calssname objectname = new calssoom();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        List.add(1); //O(1)
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List.size());

        //print the array lists
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i));

        }
        System.out.println();
    }
}
