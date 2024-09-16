package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    static class Queue {
        Stack<Integer> st ;
        Stack<Integer> helperSt;
        Queue() {
            st = new Stack<>();
            helperSt = new Stack<>();
         }
/*        // add Efficient 
         // add O(1)
        public void add(int data) {
            st.push(data);
        }
         // Peek O(n)
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty! ");
                return Integer.MIN_VALUE;
            }
            while(st.size() > 1) {
                helperSt.push(st.pop());
            }
            int top = st.peek();
            while(helperSt.size() > 0) {
                st.push(helperSt.pop());
            }
            return top;
        }
         // remove O(n)
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty! ");
                return Integer.MIN_VALUE;
            }
             while(st.size() > 1) {
                helperSt.push(st.pop());
            }
            int top = st.pop();
            while(helperSt.size() > 0) {
                st.push(helperSt.pop());
            }
            return top;
        } 
         // isEmpty O(1)
        public boolean isEmpty() {
            return st.size() == 0;
        }
        */ 


    /*     remove Efficient     */
         // add O(n)
        public void add(int data) {
            while(st.size() > 0) {
                helperSt.push(st.pop());
            }
            st.push(data);
            while(helperSt.size() > 0) {
                st.push(helperSt.pop());
            }
        }
         // Peek O(1)
        public int peek() {
            if(st.size() == 0) {
                System.out.println("Queue is Empty!");
                return Integer.MIN_VALUE;
            }
            return st.peek();
        }
         // remove O(1)
        public int remove() {
            if(st.size() == 0) {
                System.out.println("Queue is Empty!");
                return Integer.MIN_VALUE;
            }
            return st.pop();
        }
         // isEmpty O(1)
        public boolean isEmpty() {
            return st.size() == 0;
        }
        }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.st.size());
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        // System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println();
        System.out.println();
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
