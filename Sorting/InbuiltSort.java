package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void print(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    } 
     public static void main(String r[]) {
        //int arr[] = {3,2,5,4,1};
        Integer arr[] = {3,2,5,4,1};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,1,4,Collections.reverseOrder());
        print(arr);

        
    }
    
}
