package Queue;

import java.util.*;
import java.util.LinkedList;

/* Question 5 :
Maximum of all subarrays of size k
We have an array arr[] of size N and an integer K. Find the maximum for each and every
contiguous subarray of size K.
Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
Sample Output 1 : 3 3 4 5 5 5 6
 */

 // using sliding window O(n)
public class SlidingWindowMax {
    public static void slidingWindowMax(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        // first we will get our max of first window
        int i;
        for (i = 0; i < k; i++) {
            while (dq.size() > 0 && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        // Now get max of next window every time
        // here we are getting our max of window at last element of the window
        for (; i < n; i++) {
            // printing max of previous window
            System.out.print(arr[dq.peek()] + " ");
            // now check if the max of previous window comes under this window too,
            // if not then remove that
            while (dq.size() > 0 && dq.peek() <= i - k)
                dq.remove();

            // now check if the current element is greatest of all the elements in current
            // window
            // if the current element is greater than previous max then update it
            while (dq.size() > 0 && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]); // this is the max of last window
    }

    // Using Next Greater element O(n)
    public static void slidingWindMax(int[] arr, int n, int k) {
        // next greater
        Stack<Integer> st = new Stack<>();
        int[] nGe = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()])
                st.pop();
            if (st.isEmpty())
                nGe[i] = n;
            else
                nGe[i] = st.peek();

            st.push(i);

        }

        for (int i = 0, j = 0; i <= n - k; i++) {
            if (j < i)
                j = i; // when j left behind out of window
            while (nGe[j] < i + k) // j should be within the window range
                j = nGe[j]; // finding greatest of nG within the window range
            System.out.print(arr[j] + " "); // printing the Max of the window
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 2, 4, 7, 4, 7, 9 };
        int k = 3;
        // slidingWindowMax(arr, arr.length, k);
        slidingWindMax(arr, arr.length, k);
    }

}
