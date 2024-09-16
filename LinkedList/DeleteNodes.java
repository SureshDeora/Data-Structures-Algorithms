package LinkedList;

public class DeleteNodes {
    public static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void deleteNodes(int m, int n) {
        if(m == 0) {
            head = null;
            return;
        } 
        int trackm = 0,  trackn = 0; 
        Node temp = head;
        Node prev;
        while(temp != null) {
            trackm++;
            prev = temp;
            temp = temp.next;
            if(trackm == m) {
                while(trackn != n && temp != null) {
                    prev.next = temp.next;
                    temp = temp.next;
                    trackn++;
                }
                trackm = 0;
                trackn = 0;
            }
        }
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        deleteNodes(1, 9);

        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
