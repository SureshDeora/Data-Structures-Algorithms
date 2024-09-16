import java.util.ArrayList;
public class PairSum {
    /* Pair Sum :- find if any pair in a Sorted ArrayList has a target sum
     * list = [1,2,3,4,5,6],  Target = 5;
     */

     // Brute force approach O(n^2)
     public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j)==target)
                return true;
            }
        }
        return false;
     }

     // Optimal Two Pointer's approach O(n)
     public static boolean pairSumOpt(ArrayList<Integer> list, int target) {
        int lP=0;
        int rP=list.size()-1;
        while(lP<rP) {
            if(list.get(lP) + list.get(rP) == target) {
                return true;
            }
            if(list.get(lP) + list.get(rP) < target) {
                lP++;
            } else {
                rP--;
            }
        }
        return false;
     }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // System.out.println(pairSum(list, 5));
        System.out.println(pairSumOpt(list, 12));
    }
}
