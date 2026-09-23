
public class ratINmaze {

    public static void ratINmaze(int maze[][], int row, int col, int path[][]) {

        int n = maze.length;

        // boundary check
        if(row < 0 || col < 0 || row >= n || col >= n) {
            return;
        }

        // blocked cell
        if(maze[row][col] == 0) {
            return;
        }

        // already visited
        if(path[row][col] == 1) {
            return;
        }

        // destination reached
        if(row == n - 1 && col == n - 1) {
            path[row][col] = 1;
            printPath(path);
            path[row][col] = 0;
            return;
        }

        // choose current cell
        path[row][col] = 1;

        // down
        ratINmaze(maze, row + 1, col, path);

        // right
        ratINmaze(maze, row, col + 1, path);

        // up
        ratINmaze(maze, row - 1, col, path);

        // left
        ratINmaze(maze, row, col - 1, path);

        // backtracking
        path[row][col] = 0;
    }

    public static void printPath(int path[][]) {

        System.out.println("Path:");

        for(int i = 0; i < path.length; i++) {

            for(int j = 0; j < path.length; j++) {
                System.out.print(path[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = maze.length;

        int path[][] = new int[n][n];

        ratINmaze(maze, 0, 0, path);
    }
}