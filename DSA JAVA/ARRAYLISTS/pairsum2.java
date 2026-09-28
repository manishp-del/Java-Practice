import java.util.ArrayList;
public class pairsum2 {
    public static boolean pairsum2(ArrayList<Integer> List, int target){
        int lp = 0;
        int rp = List.size()-1;
        while(lp!=rp){
            //case1
            if(List.get(lp) + List.get(rp) == target){
                return true;

            }
            //case 2
            if(List.get(lp) + List.get(rp) < target){
                lp++;
        }
        else{
            rp--;
        }
    }
        return false;
    
}
    public static void main(String args[]) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int target = 3;

        System.out.println(pairsum2(height, target));
    }
    
    
}
