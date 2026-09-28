import java.util.ArrayList;

public class pairsum3 {

    public static boolean pairsum3(ArrayList<Integer> List, int target) {

        int bp = -1;
        int n = List.size();

        // Find breaking point
        for(int i = 0; i < List.size() - 1; i++) {

            if(List.get(i) > List.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // No breaking point means array is normally sorted
        if(bp == -1) {
            bp = n - 1;
        }

        // Smallest element
        int lp = (bp + 1) % n;

        // Largest element
        int rp = bp;

        while(lp != rp) {

            int sum = List.get(lp) + List.get(rp);

            // Case 1: Pair found
            if(sum == target) {
                return true;
            }

            // Case 2: Sum is smaller
            if(sum < target) {
                lp = (lp + 1) % n;
            }

            // Case 3: Sum is greater
            else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);

        int target = 16;

        System.out.println(pairsum3(height, target));
    }
}