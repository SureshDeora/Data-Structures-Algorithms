public class findKeyMatrix {

    public static boolean findkey(int matrix[][], int key) {
       
        // for(int i = 0; i< matrix.length; i++) {
        //     for(int j = 0; j< matrix[0].length; j++) {
        //         if(matrix[i][j]==key) 
        //         System.out.print(i+" "+ j);
        //         //else System.out.print("key not found");
        //     }
        // }

        int row = matrix.length-1 , coloum = 0/* matrix[3].length-4 */;
        int count = 0;
            while(row >= 0 && coloum <= matrix[0].length-1) {
                if(matrix[row][coloum]== key) {
                    System.out.print(row +","+ coloum);
                    return true;
                }
                else if(key < matrix[row][coloum]) {
                    row--;
                } else {
                    coloum++;
                }
                count++;
                System.out.print(count + "  ");
            } 
            System.out.print("key not found");
            return false;
            
        }


    
    
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};

        int key = 37;

        findkey(matrix,key);
    }
    
}
