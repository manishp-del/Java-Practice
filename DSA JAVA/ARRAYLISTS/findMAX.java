package ARRAYLISTS;

import java.util.ArrayList;

public class findMAX {
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(7); //O(1)
        List.add(0);
        List.add(20);
        List.add(27);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<List.size(); i++){
            if(max < List.get(i)){
                max = List.get(i);
            }

        }
        System.out.println("max element = " +max);
    
}}
