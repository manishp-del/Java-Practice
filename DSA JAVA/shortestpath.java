import java.util.*;

public class shortestpath {

    public static double shortestpath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path: ");
        String str = sc.nextLine();

        System.out.println("Shortest distance is = " + shortestpath(str));

        sc.close();
    }
}
