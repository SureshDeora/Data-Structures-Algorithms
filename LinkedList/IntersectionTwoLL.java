package LinkedList;

public class IntersectionTwoLL {
    
    public static class Node {
        int data;
        Node next;
    
     public  Node(int data) {
            this.data = data;
            this.next = null;
            
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static Node intersectionPoint(Node head1, Node head2) {
        while(head1!= null) {
            Node temp = head2;
            while(temp != null) {
                
                if(head1 == temp) {
                    return head1;
                }
                temp = temp.next;

            }
            head1 = head1.next;
        }
        return null;
    }
    public static void main(String[] args) {
        IntersectionTwoLL ill = new IntersectionTwoLL();
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(7);
        head.next = b; b.next = c; c.next = d; d.next = e;
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

        Node a = new Node(4);
        Node f = new Node(5);
        Node g = new Node(9);
        
        a.next =  b; 
        temp = a;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
        System.out.print(intersectionPoint(head, a));
        System.out.println();   //(iP);
        System.out.println(b);
        
    }
}
