package Queue;

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data; 
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        //  is Empty
        public boolean isEmpty() {
            return head == null && tail == null;

        }
        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // remove 
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            int result = head.data;

            if(head == tail) head = tail = null;
            else head = head.next;

            return result;
            
        }
        // peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return head.data;
        }
        }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
