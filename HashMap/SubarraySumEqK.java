package HashMap;

import java.util.HashMap;

public class SubarraySumEqK {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        // int arr[] = {10, 2, -2, -20, 10}
        int k = 3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(hm.containsKey(sum - k)) {
                count += hm.get(sum - k);
            } 
                hm.put(sum, hm.getOrDefault(sum, 0)+1);
            
        }
        System.out.println(count); // ans 2 -> {1,2}, {3}
    }
}
