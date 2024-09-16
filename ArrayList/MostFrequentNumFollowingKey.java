import java.util.ArrayList;
public class MostFrequentNumFollowingKey {
            /* Most Frequent Number following Key (EASY) 
        You are given an integer Arraylist nums. You are also given an integer key, which is present in 
        nums. 
        For every unique integer target in nums, count the number of times target immediately follows 
        an occurrence of key in nums. In other words, count the number of indices i such that: 
        0 <= i <= nums.size() - 2, 
        nums.get(i) == key and, 
        nums.get(i+1) == target. 
        Return the target with the maximum count. 
        (Assumption - that the target with maximum count is unique.) 
        Sample Input 1 :nums = [1,100,200,1,100], key = 1 
        Sample Output 1 : 100 
        Explanation : 
        For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key. 
        No other integers follow an occurrence of key, so we return 100.
        Sample Input 2 : nums = [2,2,2,2,3], key = 2 
        Sample Output 2 : 2 
        Explanation : 
        For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key. 
        For target = 3, there is only one occurrence at index 4 which follows an occurrence of key. 
        target = 2 has the maximum number of occurrences following an occurrence of key, so we 
        return 2. 
        Constraints : 
        ● 2 <= nums.size() <= 1000 
        ● 1 <= nums.get(i) <= 1000 
        ● Assume that the answer is unique. 
        Hints : Count the number of times each target value follows the key in the arraylist. 
        Choose the target with the maximum count and return it. 
        */

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(22);
        nums.add(11);
        nums.add(33);
        nums.add(11);
        nums.add(33);

        // nums.add(1);
        // nums.add(100);
        // nums.add(200);
        // nums.add(1);
        // nums.add(100);

        // nums.add(2);
        // nums.add(2);
        // nums.add(2);
        // nums.add(2);
        // nums.add(3);

        


        System.out.print("The Most Frequent Num Following Key : ");
        //System.out.println(mostFollowNum(nums, 3));
        System.out.println(optSolution(nums, 11));
    }

    public static int mostFollowNum(ArrayList<Integer> nums, int key) {
        boolean [] trackIdx = new boolean[nums.size()];
        int numAtIdx = -1;
        int count = 0;
        int newCount = 0;
        for(int i=0; i<nums.size()-1; i++) {
            newCount = 0;
            if(trackIdx[i]!= true) {
            for(int j=i+1; j<nums.size(); j++) {
                if(nums.get(i)==nums.get(j)) {
                    if(nums.get(j-1)==key) {
                        newCount++;
                        trackIdx[j]=true;
                    }
                }
                if(count<newCount) {
                    count = newCount;
                    numAtIdx = nums.get(i);
                }
            }
        }
            
        }
        return numAtIdx; 
        
    }

    public static int optSolution(ArrayList<Integer> nums, int key) {
        //couting frequency of the num which follow the rule and
        // adding that elemint frequecy to a new auxilary arr 0-999
        // we will increament that idx value , for num which found so far with
        // condition matching
        int[] map = new int[1000];
        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i)==key) {
                map[nums.get(i+1)-1]++;
            }
        }

        // Here iterating whole array to find most frquency number 
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i=0; i<map.length; i++) {
            if(max < map[i]) {
                max = map[i];
                result = i+1;

            }
        }
        return result;
    }
}
