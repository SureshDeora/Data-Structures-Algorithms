// package Queue;
import java.util.*;
import java.util.LinkedList;
// import java.util.Deque;
public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.removeLast());
        System.out.println(dq.removeFirst());
    }
    
}
