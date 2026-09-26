package ARRAYLISTS;

import java.util.ArrayList;

public class MULTIDIMENTIONAL {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            List.add(i * 1);    // 1 2 3 4 5
            List2.add(i * 2);   // 2 4 6 8 10
            List3.add(i * 3);   // 3 6 9 12 15
        }

        mainList.add(List);
        mainList.add(List2);
        mainList.add(List3);

        List2.remove(3);
        List2.remove(2);

        System.out.println(mainList);

        // Nested loops
        for (int i = 0; i < mainList.size(); i++) {

            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}