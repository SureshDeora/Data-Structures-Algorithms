package HashMap;
import java.util.*;
import java.util.HashMap;

public class MajorityElement {
    /*Question
     * Given an integer array of size n, find all lements that appear more than
     * [n/3] times
     * nums[]= {1,3,2,5,1,3,1,5,1};
     * Output = 1
     * nums[]={1, 2};
     * Output = 1,2
     */
    public static void main(String args[]) {
        int nums[] = {1,3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> hm = new HashMap<>(); // Time complexity O(n);
        for(int i=0; i<nums.length; i++) {
            // if(hm.containsKey(nums[i])) {
            //     hm.put(nums[i], hm.get(nums[i]) + 1);
            // } else {
            //     hm.put(nums[i], 1);
            // }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) +1);
        }
        
        // Set<Integer> keys = hm.keySet();
        for (Integer key : hm.keySet()) { //keys
            if(hm.get(key) > nums.length/3) {
                System.out.println(key);
            }
        }
    }
}
