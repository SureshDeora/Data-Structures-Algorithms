public class Chatgpt {
    
        private static final int BOARD_SIZE = 5;
        private static final int[] ROW_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
        private static final int[] COL_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};
    
        public static void main(String[] args) {
            int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
            solveKnightsTour(board);
        }
    
        public static void solveKnightsTour(int[][] board) {
            board[0][0] = 0; // Start position
            if (solve(board, 0, 0, 1)) {
                printBoard(board);
            } else {
                System.out.println("No solution exists.");
            }
        }
    
        private static boolean solve(int[][] board, int row, int col, int moveCount) {
            if (moveCount == BOARD_SIZE * BOARD_SIZE) {
                return true; // All cells have been visited
            }
    
            for (int i = 0; i < ROW_MOVES.length; i++) {
                int nextRow = row + ROW_MOVES[i];
                int nextCol = col + COL_MOVES[i];
    
                if (isValidMove(board, nextRow, nextCol)) {
                    board[nextRow][nextCol] = moveCount;
    
                    if (solve(board, nextRow, nextCol, moveCount + 1)) {
                        return true;
                    } else {
                        // Backtrack
                        board[nextRow][nextCol] = 0;
                    }
                }
            }
    
            return false;
        }
    
        private static boolean isValidMove(int[][] board, int row, int col) {
            return (row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == 0);
        }
    
        private static void printBoard(int[][] board) {
            for (int[] row : board) {
                for (int cell : row) {
                    System.out.printf("%2d ", cell);
                }
                System.out.println();
            }
        }
    
    
}
