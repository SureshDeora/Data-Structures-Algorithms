package Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueInBuilt {
    public static void main(String[] args) {
        // while creating object of the queue we call either LinkedList or ArrayDeque
        Queue<Integer> q = new LinkedList<>(); // queue is not a class, it's a interface , 
                                                // the class which use this data structer, we call them while creating object 
        // Queue<Integer> q = new ArrayDeque<>();                                     
        q.add(1); // to add element in the queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.offer(5); // it is also to add
        System.out.println(q); // to print whole queue
        System.out.println(q.remove()); // to remove head of the queue
        System.out.println(q.peek()); // to get data at head of the queue
        System.out.println(); 
        System.out.println(q);
        System.out.println(q.size()); // size of the queue
        System.out.println(q.isEmpty()); // check if queue is empty or not
        System.out.println(q.element()); // same as peek to get head of the queue 
        System.out.println(q.remove());
        System.out.println(q.poll()); // same as remove 
        System.out.println(q);
    }
}
