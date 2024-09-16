package LinkedList;

public class MergeSortLL {

    public static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
 
    private static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node leftPart = mergeSort(head);
        Node rightPart = mergeSort(rightHead);

        return merge(leftPart, rightPart);
    }
    public static void main(String[] arges) {

        Node head = new Node(8);
        Node a = new Node(7);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(5);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        Node start = mergeSort(head);
        while(start != null) {
            System.out.print(start.data+ " ");
            start = start.next;
        }
    }
}
