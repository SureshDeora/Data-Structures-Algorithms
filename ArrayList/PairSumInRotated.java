import java.util.ArrayList;
public class PairSumInRotated {            
/* Pair Sum :- find if any pair in a Sorted ArrayList has a target sum
     * list = [4,5,6,1,2,3],  Target = 5;
      */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(pairSum(list, 2));
    }

    // Two Pointer approach O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // first getting our pivPoint/breaking point where our AL is rotated from
        int pivPoint=-1;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                pivPoint=i;
                break;
            }
        }


        int n = list.size();
        //left pointer assigned to the smallest value
        int lP = pivPoint+1;
        // right pointer assigned to the biggest value
        int rP = pivPoint;

        //iterating while lp and rp cross each other
        while(lP != rP) {
            // case 1 when out lp+rp value == target
            if(list.get(lP)+list.get(rP)==target) {
                return true;
            }


            /* Here we are using Modulo Arithemetic technic 
            to update idx values of lp and rp */

            // case 2 when our target value is greater then lP+rP
            //increasing left pointer otherwise right pointer
            if(list.get(lP)+list.get(rP)<target) {
                lP = (lP+1) % n; //lP++
            } else {
                rP = (n+rP-1) % n; //rP--
            }
        }
        return false;
    }
}
