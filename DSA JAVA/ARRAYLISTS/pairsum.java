import java.util.ArrayList;

public class pairsum {

    public static boolean pairsum(ArrayList<Integer> List, int target) {

        for(int i = 0; i < List.size(); i++) {

            for(int j = i + 1; j < List.size(); j++) {

                if(List.get(i) + List.get(j) == target) {
                    return true;
                }
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

        System.out.println(pairsum(height, target));
    }
}