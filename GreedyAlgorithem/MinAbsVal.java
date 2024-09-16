import java.util.*;

// get min sum of all the absolute difference of two array elements
// a = {1, 2, 3}        |1-1| |2-2|  |3-3| = 0+0+0 = 0
// b = {3, 2, 1};         output ans = 0
public class MinAbsVal {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = {3, 1, 2};
        Arrays.sort(a);
        Arrays.sort(b);
        
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        System.out.println(sum);
    }
    
}
