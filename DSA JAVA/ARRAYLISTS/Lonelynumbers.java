import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Lonelynumbers {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Store all numbers for fast searching
        HashSet<Integer> set = new HashSet<>(nums);

        for(int i = 0; i < nums.size(); i++) {

            int x = nums.get(i);

            // x must appear only once
            if(nums.indexOf(x) != nums.lastIndexOf(x)) {
                continue;
            }

            // x-1 and x+1 should not be present
            if(!set.contains(x - 1) && !set.contains(x + 1)) {
                ans.add(x);
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        ArrayList<Integer> result = findLonely(nums);

        System.out.println("Lonely numbers = " + result);

        sc.close();
    }
}