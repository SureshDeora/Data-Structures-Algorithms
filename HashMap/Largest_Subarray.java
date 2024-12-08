package HashMap;

import java.util.HashMap;

public class Largest_Subarray {
    /*Question
     * Largest subarray with 0 sum
     * arr = {15, -2, 2, -8, 1, 7, 10 23};
     * ans = 5; form idx 1 to 5
     * 
     * arr = {3, 4, 5}
     * ans = 0
     */
    public static void main(String args[]) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        // int arr[] = {3, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum)) {
                length = Math.max(length, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println(length);
    }
}
