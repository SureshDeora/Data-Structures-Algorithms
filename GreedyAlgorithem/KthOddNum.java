import java.util.*;
public class KthOddNum {

    // It's time complexity is very high = range of l and r
    // public static int kthOddNum(int l, int r, int k) {
    //     int count = 0;
    //     for(int i=r; i>=l; i++){
    //         if(i%2 != 0) {
    //             count++;
    //         }
    //         if(count == k) {
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    public static int kthOddNum(int[] p, int k) {
        if(k <= 0) {
            return 0;
        }
        int L = p[0];
        int R = p[1];
        // if R is odd 
        if((R & 1) > 0) {
            // Calculate count of odds within the range
            int count = (int)Math.ceil((R-L+1)/2);
            // if kth odd num is not in range
            if(k>count) {
                return 0;
            } else {
                return (R - 2 * k + 2); // if R is odd to get kth largest odd
            }
        } else { // when R is even
            // calculating count of odds within the range
            int count = (R - L + 1)/2;
            if(k>count) { 
                return 0;
            } else {
                return (R - 2 * k + 1); // getting largest kth odd num
            }
        }
    } /* We can do same for kth largest even in a range by just swapping if else conditions */

    public static void main(String[] args) {
        int[] p = {-10, 10};
        int k = 8;
        // System.out.println(kthOddNum(p, k));
        System.out.println(10 & 1);
    }
    
}
