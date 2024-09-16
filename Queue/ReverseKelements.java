package Queue;
import java.util.*;
import java.util.LinkedList;

/* Reversing the first K elements of a Queue
We have an integer k and a queue of integers, we need to reverse the order of the first k
elements of the queue, leaving the other elements in the same relative order.
Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100] */
public class ReverseKelements {
    public static void reverseKelements(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<k; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        int size = q.size();
        int i = 0;
        while( i++ < size-k) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseKelements(q, 3);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        
    }
}
