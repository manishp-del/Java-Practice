import java.util.*;
public class nROWqueens {
        public static void nqueens(char board[][], int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nqueens(board, row+1);  //function call
            board[row][j] = '.';//backtracking step
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("_________ chess board ________");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");


            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        //initialize board
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';

            }
        }
        nqueens(board, 0);
        sc.close();
            }
        }
            
        
    
