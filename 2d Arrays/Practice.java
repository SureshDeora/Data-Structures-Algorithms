public class Practice {
    //frequency of 7
    
    public static void freq(int matrix[][], int key) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                } 
            }
        } System.out.print(count);
    }


    public static void sumOfSRow(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
           
            for(int j=0; j<matrix[0].length; j++) {
                if(i == 1 ) {
                    sum += matrix[i][j];
                }
            } 
        }System.out.print(sum);
    }


    public static void rotateMatrix(int matrix[][]) {
        int row = 3, col = 3;
        int transportMat[][] = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                transportMat[j][i] = matrix[i][j];
            }
        }
        for(int i = 0; i < transportMat.length; i++) {
            for(int j=0; j<transportMat[0].length; j++) {
                System.out.print(transportMat[i][j]  +" ");
            } System.out.println();
    }
    }
    public static void removeDupli(int arr[]) {
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[j]!=arr[i]) {
                j++;
                arr[j] = arr[i];

            } 
        }  for(int i=0; i<=j; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // public static void print(int arr[])  {
    //     for(int i=0; i<arr.length; i++) {
    //     System.out.print(arr[i]+" ");
    // }}



    




public static void spiralMat(int matrix[][]) {
    int startRow = 0;
    int endRow = matrix.length-1;
    int startCol = 0; 
    int endCol = matrix[0].length-1;
    
    while(startRow <= endRow && startCol <= endCol) {
        for(int j = startCol; j<=endCol; j++) {
            System.out.print(matrix[startRow][j]);
        }


        for(int i=startRow+1; i<=endRow; i++) {
            System.out.print(matrix[i][endCol]);
        }

        for(int j=endCol-1; j>=startCol; j--) {
            System.out.print(matrix[endRow][j]);
        }

        for(int i=endRow-1; i>=startRow+1; i--) {
            System.out.print(matrix[i][startCol]);
        }

        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
    System.out.println();
}


public static void rotateMat(int mat[][]) {
    int row = 3,  col = 3;
    int rMat[][] = new int[col][row];
    for(int i=0; i<=rMat.length-1; i++) {
        for(int j=0; j<=rMat[0].length-1; j++){
            rMat[j][i] = mat[i][j];
        }
    }
    for(int i=0; i<rMat.length; i++) {
        for(int j=0; j<rMat[0].length; j++) {
            System.out.print(rMat[i][j]);
        }
        System.out.println();
    }
   
   
}

    

 

    public static void main(String args[]) {
        int arr [] = {1,1,2,3,3,3,4,5,5};
        removeDupli(arr);
        //print(arr);
        // int matrix [][] = {{4,7,8},
        //                    {8,8,7}};
    
        // int key = 8;
        // freq(matrix, key);

        

        int matrix [][]={{2,4,9},
                        {11,7,3},
                        {2,0,5}};

                        
         //spiralMat(matrix);  
         //rotateMat(matrix);             
        // sumOfSRow(matrix);



        // int matrix [][] = {{2,3,7},
        //                   {5,6,7}};

        // rotateMatrix(matrix);

         
        
        
        
    }
    
    
}
