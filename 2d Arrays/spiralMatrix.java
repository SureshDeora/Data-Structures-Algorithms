public class spiralMatrix {
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol)  {
            //upside
            for(int j = startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
                }
                //rightside
                for(int i=startRow+1; i<=endRow; i++) {
                    System.out.print(matrix[i][endCol]+" ");
                }
                //downside
                for(int j=endCol-1; j>=startCol; j--) {
                    System.out.print(matrix[endRow][j]+" ");
                }
                //leftside
                for(int i=endRow-1; i>=startRow+1; i--) {
                    System.out.print(matrix[i][startCol]+" ");
                }
                startRow++;
                endRow--;
                startCol++;
                endCol--;
            
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int matrix [][] = {{1,2,3},
                           {5,6,7},
                           {9,10,11}};
                          // {13,14,15,16}};


        spiralMatrix(matrix);

    }
    
}
