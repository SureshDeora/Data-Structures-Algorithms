import java.util.*;
import java.util.LinkedList;
public class StackQueueByDeque {
    // Stack using Deque
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        // Push
    public void push(int data) {
        dq.addLast(data);
    }

      // Pop
    public int pop() {
        return dq.removeLast();
    }

    // Peek
    public int peek() {
        return dq.getLast();
    }
    }


    /* Queue using Deque */
    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        // Push
    public void add(int data) {
        dq.addLast(data);
    }

    // Pop
    public int remove() {
        return dq.removeFirst();
    }

     // Peek
     public int peek() {
        return dq.getFirst();
     }
    }
 public static void main(String[] args) {
    // Stack
    // Stack st = new Stack();
    // st.push(1);
    // st.push(2);
    // st.push(3);
    // System.out.println(st.peek());
    // System.out.println(st.pop());

    // Queue
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek());
 }   
}

