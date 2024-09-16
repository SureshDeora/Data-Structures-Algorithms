import java.util.*;
import java.util.Scanner;

public class Backtracking {

    // Backtracking on an Array
    public static void changeArr(int arr[], int idx, int val) {
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1);
        arr[idx] = arr[idx] - 2; // Changing Array values while Backtracking
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Print all the subsets of a strings
    // Decision BT
    public static void subStr(String str, String subSet, int i) {
        if (i == str.length()) {
            if (subSet == "") { // if (subSet.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(subSet);
            }
            return;
        }
        // yes choice
        subStr(str, subSet + str.charAt(i), i + 1);
        // No choice
        subStr(str, subSet, i + 1); // backtracking
    }

    // Combination using Recursion nCr
    /*
     * n n n n n
     * n n! 2 = C + C + C + _ _ _ _ _ _ + C
     * C == ----------- 0 1 2 n
     * r r!(n-r)!
     * 
     * 
     */
    public static void combination(String str, String ans, int i, int r) {
        if (i == str.length()) {
            if (ans.length() == r) {
                System.out.println(ans);
            }
            return;
        }
        combination(str, ans + str.charAt(i), i + 1, r);
        combination(str, ans, i + 1, r);
    }

    /*
     * cb = current box, tb = total box [n], ssf = selection so far or yes
     * selection, ts = total seletion [r] , asf = answer so far
     */
    public static void combination1(int cb, int tb, int ssf, int ts, String asf) {

        if (cb > tb) {
            if (ssf == ts) { // Print only the nCr Combinations for requied selection or total selection we
                             // want [r]. without this
                             // condition it'll print all the nCn combination
                System.out.println(asf);
            }
            return;
        }

        // Yes choice
        combination1(cb + 1, tb, ssf + 1, ts, asf + "i");
        // No Choice
        combination1(cb + 1, tb, ssf, ts, asf + "_"); // Adding '_' for no choices temperory
    }

    // Combination to permutation
    public static void c2p(int cb, int tb, int[] items, int ssf, int ts, String asf) {
        if (cb > tb) {
            // if(ssf == ts) {
            System.out.println(asf);
            // }
            return;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] == 0) {
                items[i] = cb;
                c2p(cb + 1, tb, items, ssf + 1, ts, asf + (i + 1));
                items[i] = 0;
            }
        }
        c2p(cb + 1, tb, items, ssf, ts, asf + "_");
    }

    // Permutation to Combination.
    // ci = current item, ti = total item[r] , llb = level/iteration of last box
    // in java boolean empty array default value is false , intizar empty arr = 0,
    // empty string ""
    public static void p2c(boolean[] nBoxes, int ci, int ti, int llb) {
        if (ci > ti) {
            for (int i = 0; i < nBoxes.length; i++) {
                if (nBoxes[i]) {
                    System.out.print("i");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
            return;
        }
        for (int i = llb; i < nBoxes.length; i++) {
            if (nBoxes[i] == false) {
                nBoxes[i] = true;
                p2c(nBoxes, ci + 1, ti, i + 1);
                nBoxes[i] = false;
            }
        }
    }

    // Permutation on Array through backtracking nPr
    /*
     * 
     * n n!
     * P == -----------
     * r (n-r)!
     * 
     * 
     */
    // Enumeration BT
    /* tb = totalboxes [n], ci = current item/index, ti = total items [r] */
    public static void permutation(int[] tb, int ci, int[] ti) {

        // Base Case
        if (ci >= ti.length) {
            for (int i = 0; i < tb.length; i++) {
                System.out.print(tb[i]); // Printing Permutation
            }
            System.out.println();
            return;
        }

        // Recursion

        for (int i = 0; i < tb.length; i++) { // iterating on totalboxes or totalSpace arr
            if (tb[i] == 0) { // checking if ith idx == 0 means empty.
                tb[i] = ti[ci]; // totalbox ith indax par putting values of cith elemtent
                permutation(tb, ci + 1, ti); // recursion call and cith index updating
                tb[i] = 0; // empting while backtracking.
            }
        }
    }

    // String Permutation
    public static void strPer(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // removing ith character from the String //Ex:- abcde removing i=2nd character
            // 'c'
            String lStr = str.substring(0, i); // 0 to i-1 = "ab" (i-1 it is because ending idx doesn't include)
            String rStr = str.substring(i + 1); // i+1 to end = "de"
            String lrStr = lStr + rStr; // NewString = "abde" this is how we removed ith character from a string
            strPer(lrStr, ans + curr);
        }

    }

    /// ******************** N Queens Problems *********************/
    // N queens All Permutations
    public static void nqueen(int[][] chess, int qsf, int tq) {
        if (qsf >= tq) {
            System.out.println("---------Chess Board-----------");
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[0].length; j++) {
                    if (chess[i][j] == 0) {
                        System.out.print("- \t");
                    } else {
                        System.out.print("q" + chess[i][j] + "\t");
                    }
                }
                System.out.println();

            }
            System.out.println();
            return;
        }
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if (chess[i][j] == 0) {
                    chess[i][j] = (qsf + 1);
                    nqueen(chess, qsf + 1, tq);
                    chess[i][j] = 0;
                }
            }
        }
    }

    // N Queens All Combinations
    public static void queenComb(int raw, int col, int tq, int qssf, String asf) {
        if (raw == tq) {
            if (qssf == tq) {
                System.out.println("---------nQueen Chess---------");
                System.out.println(asf);
            }
            ;

            return; // col col
        } // 0 1
        int nc = 0; // raw 0 [] [] q q
                    //
        int nr = 0; // raw 1 [] [] _ _

        String ysf = ""; //
        String nsf = "";
        if (col == tq - 1) {
            nr = raw + 1;
            nc = 0;
            ysf = asf + "q \n";
            nsf = asf + "_\n";
        } else {
            nr = raw;
            nc = col + 1;
            ysf = asf + "q";
            nsf = asf + "_";
        }

        // Yes Choice
        queenComb(nr, nc, tq, qssf + 1, ysf);

        // No Choice
        queenComb(nr, nc, tq, qssf + 0, nsf);
    }

    // N Queen[Chess] Combination in 2d n*n array

    public static void nQt(char[][] board, int raw) {

        if (raw == board.length) {

            System.out.println("\n----------Chess Board------------");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j] + "  ");
                }
                System.out.println();
            }

            return;
        }
        for (int j = 0; j < board.length; j++) { // Here placing one Queen in each raw.
            if (isSafe(board, raw, j)) { // checking if the queen is safe to place in the perticular raw.

                board[raw][j] = 'Q';
                nQt(board, raw + 1);
                board[raw][j] = 'X';
            }
        }

    }

    // nQt Helper function

    public static boolean isSafe(char[][] board, int raw, int col) {
        // Checking left diagonal if queen is safe to place

        for (int i = raw - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }

        }
        // Checking vertical up if queen is safe to place
        for (int i = raw - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Checking right diagonal if queen is safe to place

        for (int i = raw - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }

        }
        return true;
    }

    // checking if any solution available for queen and printing only the first
    // solution
    public static boolean nQc(char[][] chess, int raw) {
        if (raw == chess.length) {
            return true;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isSafe(chess, raw, col)) {
                chess[raw][col] = 'Q';

                if (nQc(chess, raw + 1)) {
                    return true;
                }
                chess[raw][col] = 'X';
            }
        }
        return false;
    }

    public static void printB(char[][] board) {
        System.out.println("\n----------Chess Board------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Checking how many possible ways are there.
    static int count;

    public static void nQw(char[][] chess, int raw) {
        if (raw == chess.length) {
            count++;
            return;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isSafe(chess, raw, col)) {
                chess[raw][col] = 'Q';
                nQw(chess, raw + 1);
                chess[raw][col] = 'X';
            }
        }
    }

    // Grid Ways ==> ways to reach from source[0,0] to destination[n,m]
    // only Rigth and Down moves are allowed
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        int rightWays = gridWays(i + 1, j, n, m);
        int downWays = gridWays(i, j + 1, n, m);
        int totalWays = rightWays + downWays;
        return totalWays;
    }

    // Sudoku Solver
    public static boolean sudoku(int[][] Sboard, int row, int col) {
        if (row == Sboard.length) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == Sboard.length) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (Sboard[row][col] != 0) {
            return sudoku(Sboard, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isDSafe(Sboard, row, col, digit)) {
                Sboard[row][col] = digit;
                if (sudoku(Sboard, nextRow, nextCol)) {
                    return true;
                }
                Sboard[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isDSafe(int[][] Sboard, int row, int col, int digit) {
        // checking in same row
        for (int i = 0; i < Sboard.length; i++) {
            if (Sboard[row][i] == digit) {
                return false;
            }
        }
        // checking col
        for (int i = 0; i < Sboard.length; i++) {
            if (Sboard[i][col] == digit) {
                return false;
            }
        }

        // Checking in 3*3 Grid
        // formula of getting starting row and colum for perticualr index
        int sr = (row / 3) * 3; // starting row
        int sc = (col / 3) * 3; // starting col

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (Sboard[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] board) {
        System.out.println("\n----------Sudoku  solver------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Problems from Assignment
    // Rat in Maze(Bhoolbhulaiya)
    //Printing all the posible ways
    public static void ratMaze(int[][] maze, int row, int col, int[][] sMaze) {
        //when rate is on his destination
        if (row==maze.length-1 && col==maze.length-1 && maze[row][col]==1) {

            sMaze[row][col] = 1;
            solMaze(sMaze);
            // sMaze[row][col] = 0; when commented this line will print only 1 solution

            return;
        }

        // when row or col goes out of maze
        // if (row==maze.length || col==maze.length) {
        //     return;
        // }

        // when row or col goes out of maze    
        // if (row<0 || col<0) {
        //     return;
        // }

        // auxilary arr for checking if we already went to place
        // if (sMaze[row][col]==1) {
        //     return;
        // }

        // when our value is 0 in matrix, it indicates barrier or blocked, we can't go through
        // if (maze[row][col]==0) {
        //     return;
        // }


        // Checking all above cases in a single function
        if(isRSafe(maze, row, col, sMaze)) {
        sMaze[row][col] = 1; //tracking the path
        // right move
        ratMaze(maze, row, col + 1, sMaze);
        // Down move
        ratMaze(maze, row + 1, col, sMaze);
        // Left move
        ratMaze(maze, row, col - 1, sMaze);
        // Up move
        ratMaze(maze, row - 1, col, sMaze);

        sMaze[row][col] = 0; // Backtracking
        }
    }

    public static boolean isRSafe(int[][] maze, int row, int col, int[][]sMaze) {

        //it will return false if any of these conditions do not match.
        //Here we are checking for edge/boundry cases.
        return (row!=maze.length && col!=maze.length && row>=0 && col>=0 &&
         maze[row][col]!=0 && sMaze[row][col]!=1);

        // if (row<0 || col<0) {
        //     return false;
        // }

        // if (maze[row][col]==0) {
        //     return false;
        // }

        // if (sMaze[row][col]==1) {
        //     return false;
        // }

        // return true;
    }

    public static void solMaze(int[][] board) {
        System.out.println("\n----------Rat in Maze------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "  ");

            }
            System.out.println();
        }
    }

    // Mobile Keypad Combinations
    final static String[] keypad = {"", "", "abc", "def", "ghi", "jkl",
                                         "mno", "pqrs", "tuv", "wxyz"};
    public static void keyComb(String keys, String combination, int idx) {
        if(idx == keys.length()) {
            System.out.println(combination);
            return;
        }

       // int num = keys.charAt(idx)-'0'; 
        String ans = keypad[Character.getNumericValue(keys.charAt(idx))];
        //String ans = keypad[num];
        if(ans.length()==0) {
            keyComb(keys, combination, idx+1);
        }
        for(int i=0; i<ans.length(); i++) {
            char curr = ans.charAt(i);
            keyComb(keys, combination+curr, idx+1);
        }
    }


// Knight's Tour 


    public static void solveKT() {
         
        int[][] board = new int[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }

        board[0][0]=0;
        if(knightTour(board, 0, 0, 1, n)) {
            printK(board);
        } else {
            System.out.println("Solution does not exist");
        }
          

    }

        static int n = 8;
        final static int[] rMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
        final static int[] cMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean knightTour(int[][] board, int r, int c, int k, int n) {
        int i, nextRMove, nextCMove;
        if(k==n*n) {
           
            return true;
        }
       
        
        for( i=0; i<8; i++) {
            nextRMove = rMoves[i]+r; 
            nextCMove = cMoves[i]+c;
            
            if(isSafe(board, nextRMove, nextCMove)) {
                board[nextRMove][nextCMove]=k;

                if(knightTour(board, nextRMove, nextCMove, k+1, n))
                return true;
                else {  
                board[nextRMove][nextCMove]=-1;
                }         
            } 

        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        return (row<n && row>=0 
        && col<n && col>=0 && board[row][col]==-1);
    }

    public static void printK(int[][] board) {

        System.out.println("\n ---------------- \n");
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

       //solveKT();

        //keyComb("23", "", 0);

        int maze[][] = { { 1, 0, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 1, 1 } };
        int[][] sMaze = new int[maze.length][maze.length];
        ratMaze(maze, 0, 0, sMaze);
        solMaze(sMaze);


        int[][] sudokuBoard = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        // System.out.println(sudokuBoard.length);
        // sudoku(sudokuBoard, 0, 0);

        // if(sudoku(sudokuBoard, 0, 0)) {
        // printSudoku(sudokuBoard);
        // }
        // else {
        // System.out.println("Solution doesn't exist");
        // }

        // int n = 3, m =3;
        // System.out.println(gridWays(0, 0, n, m));

        /*
         * int n = 6;
         * char[][] chessBoard = new char[n][n];
         * for(int i = 0; i < chessBoard.length; i++) {
         * for(int j = 0; j < chessBoard[0].length; j++) {
         * chessBoard[i][j] = 'X';
         * }
         * }
         */

        // Printing all the possible queen
        // nQt(chessBoard, 0);

        // print how many possible ways are there
        // nQw(chessBoard, 0);
        // System.out.println(count);

        /*
         * checkign if there is possible and printing the first way.
         * if(nQc(chessBoard, 0)) {
         * System.out.println("Solution is posible ");
         * printB(chessBoard);
         * } else {
         * System.out.println("Solution is not posible ");
         * }
         */

        // queenComb(0, 0, 3, 0, "");

        // int n = 2;
        // nqueen(new int[n][n], 0, n);

        // String nBoxes = "abc";
        // String ans = "";
        // strPer(nBoxes, ans);

        // Scanner scn = new Scanner(System.in);
        // System.out.println("Input Your Value");
        // int scr = scn.nextInt();
        // System.out.println("The Value is " +scr);

        // int totalSpaces[] = new int[3];
        // int requiredSpaces[] = {1,2,3};
        // char arr[] = {'a','b','c'};
        // permutation(totalSpaces, 0, requiredSpaces);

        // combination("abcde", "", 0, 2);
        // int[] arr = {1,2,3};
        // int ans[] = new int[1];

        // int cb, int tb, int ssf, int ts, String asf
        // combination1(1, 4, 0, 2, "");
        // int totalBox = 3;
        // int rItem = 2;
        // c2p(1, totalBox, new int[rItem], 0, rItem, "");

        // int nBoxes = 3;
        // int rItem = 2;
        // p2c(new boolean[nBoxes], 1, rItem, 0);

        // String str = "";
        // System.out.println(str+1);

        // String str = "abc";
        // String st = "";
        // System.out.print(st.length());
        // subStr(str, "", 0);

        // int[] arr = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // System.out.println("Jay Shree Ram");
    }
}