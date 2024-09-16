package Queue;
import java.util.*;
import java.util.LinkedList;
public class InterleaveQueue {
    /* InterLeave two halves of a queue(even length)
     * q = 1, 2, 3, 4, 5, 6
     * output = 1, 4, 2, 5, 3, 6
     */
    // first we will devide our queue into two parts, 1st half we will save to a 
    // auxilary queue and then we will interleave element accordingly
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=1; i<=size/2; i++) {
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interLeave(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        } System.out.println();
    }
    
}
