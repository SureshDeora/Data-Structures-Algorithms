package LinkedList;

public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
     public  Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            addFirst(data);
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeFirst() {
        //we can add condition for size 0 ;
        if(head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void removeLast() {
        if(head.next == null) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void reverse() {
        if(head.next == null) {
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print() {
        //we can add codition if our ll is empty;
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        // dll.removeFirst();
        // dll.removeLast();
        dll.print();
       dll.reverse();
        dll.print();
    }
}
