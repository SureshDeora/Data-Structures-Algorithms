package LinkedList;

public class ZigZagLL {
    public static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public void zigzag(Node head) {
        // find mid 
        Node slow = head;
        Node fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
        Node curr = slow.next;
        slow.next = null;
        Node prev = null;
        Node next;

        // reverse after mid
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL, nextR;
        // alternate merging
        while(leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;
            
            leftHead = nextL;
            rightHead = nextR;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
    a.next = b; b.next = c; c.next = d; d.next = e;

    Node temp = a;
    while(temp != null) {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
    ZigZagLL ll = new ZigZagLL();
    ll.zigzag(a);
     temp = a;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
    }
}
