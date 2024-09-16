import java.util.*;


public class MinOfMatrix {
    public static void minOfArr(int arr[][]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        System.out.print("Min of Matrix = "+min);
    }

    public static void main(String args[]) {
    Scanner scr = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                arr[i][j] = scr.nextInt();
            }
            }
            for(int i=0; i<arr.length; i++) {
                for (int j=0; j<arr[0].length; j++) {
                   
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
                }

                //search(arr, 6);
                minOfArr(arr);
    
}
}
