package HashMap;
import java.util.*;

public class CountDistinctElement {
    /*Question
     * num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1}
     * ans = 7;
     * 
     * 
     * We will be using HashSet for this problem because HashSet has property of adding 
     * unique value, it doesn't allow any duplicates , 
     * Then at the end the size of the HS is our answer. 
     */
    public static void main(String args[]) {
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1}; 

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            hs.add(arr[i]);
        }
        
        System.out.println(hs.size());
    }
}
