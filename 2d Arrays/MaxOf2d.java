
import java.util.*;

public class MaxOf2d {
    // public static void search(int arr[][],int key) {
    //     for(int i=0; i<arr.length; i++) {
    //         for (int j=0; j<arr[0].length; j++) {
    //             if(arr[i][j] == key) {
    //                 System.out.print(arr[i][j]+ " at Indax = " + i +" "+ j);
    //             }
    //         }
    //         }
    //     }

            public static void maxOfArr(int arr[][]) {
                int max = Integer.MIN_VALUE;
                for(int i=0; i<arr.length; i++) {
                    for(int j=0; j<arr[0].length; j++) {
                        max = Math.max(max, arr[i][j]);
                    }
                }
                System.out.print("Max of Matrix = "+max);
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
                maxOfArr(arr);

    }
    
}
