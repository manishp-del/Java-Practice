import java.util.ArrayList;
import java.util.Scanner;

public class Monotonicarraylist {

    public static boolean isMonotonic(ArrayList<Integer> nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.size() - 1; i++) {

            // Check increasing
            if(nums.get(i) > nums.get(i + 1)) {
                increasing = false;
            }

            // Check decreasing
            if(nums.get(i) < nums.get(i + 1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
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

        System.out.println("ArrayList = " + nums);

        System.out.println("Is Monotonic? " + isMonotonic(nums));

        sc.close();
    }
}