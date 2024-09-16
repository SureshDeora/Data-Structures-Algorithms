import java.util.*;

public class KnightsTour {

    // Knights Tour
    static int count = 0;
    public static void knightTour(int[][] board, int r, int c, int k, int n) {
        if(isSafe(board, r, c, n)){
            return ;
        }
        
         else if (k+1 == (n * n)) {
            // board[r][c] = k;
            // printSol(board);
            // board[r][c] = -1;
            count++;
            return ;
        }

        board[r][c] = k;
        
        knightTour(board, r + 2, c + 1, k + 1, n);
        knightTour(board, r + 1, c + 2, k + 1, n);
        knightTour(board, r - 1, c + 2, k + 1, n);
        knightTour(board, r - 2, c + 1, k + 1, n);
        knightTour(board, r - 2, c - 1, k + 1, n);
        knightTour(board, r - 1, c - 2, k + 1, n);
        knightTour(board, r + 1, c - 2, k + 1, n);
        knightTour(board, r + 2, c - 1, k + 1, n);
            
        board[r][c] = -1;
        return ;
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        return !(row >= 0 && row < n && col >= 0 && col < n
                && board[row][col] == -1);

    }

    public static void printSol(int[][] board) {

        System.out.println("\n ---------------- \n");
        for (int[] row : board) {
            for (int col : row) {
                System.out.printf("%-4d", col);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter positions ");
        // System.out.print("Row : ");
        // int rowPos = sc.nextInt();
        // System.out.print("Column : ");
        // int colPos = sc.nextInt();
        // System.out.print("Enter Board Size : ");
        // int n = sc.nextInt();
        int n = 8;
        int[][] board = new int[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
        
        knightTour(board, 0, 0, 0, n);
        //printSol(board);
        System.out.println(count);
        
    }

}
