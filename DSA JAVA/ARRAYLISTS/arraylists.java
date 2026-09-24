package ARRAYLISTS;
import java.util.ArrayList;
public class arraylists {
    public static void main(String args[]){
        //calssname objectname = new calssoom();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        List.add(1); //O(1)
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        List.add(1, 5); //O(n)
        //get element
        //int element = List.get(2);
       //System.out.println(element);
       

       //remove element
       //List.remove(2);
       //System.out.println(List);



       //set element at index
       //List.set(2, 10);
       //System.out.println(List);

       //contains element
       System.out.println(List.contains(1));
       System.out.println(List.contains(11));


    }

    
}
