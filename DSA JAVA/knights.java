import java.util.*;

public class knights{

    // All 8 possible moves of a Knight
    static int moves[][] = {
        {2, 1},
        {1, 2},
        {-1, 2},
        {-2, 1},
        {-2, -1},
        {-1, -2},
        {1, -2},
        {2, -1}
    };

    public static boolean knightTour(int board[][], int row, int col, int move) {

        int n = board.length;

        // All cells visited
        if (move == n * n) {
            return true;
        }

        // Try all 8 possible Knight moves
        for (int i = 0; i < 8; i++) {

            int nextRow = row + moves[i][0];
            int nextCol = col + moves[i][1];

            // Check whether next position is valid
            if (nextRow >= 0 && nextRow < n &&
                nextCol >= 0 && nextCol < n &&
                board[nextRow][nextCol] == -1) {

                // Make the move
                board[nextRow][nextCol] = move;

                // Recursive call
                if (knightTour(board, nextRow, nextCol, move + 1)) {
                    return true;
                }

                // Backtracking
                board[nextRow][nextCol] = -1;
            }
        }

        return false;
    }

    public static void printBoard(int board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int board[][] = new int[n][n];

        // Initially all cells are unvisited
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], -1);
        }

        // Knight starts from first cell
        board[0][0] = 0;

        if (knightTour(board, 0, 0, 1)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }

        sc.close();
    }
}