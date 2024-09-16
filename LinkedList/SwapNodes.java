package LinkedList;

public class SwapNodes {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

//     public static void swapNodes(int x, int y) {
//     if(x == y) return;
//     Node c1 = head;
//     Node p1 = null, n1 = null;
//     while(c1!=null) {
//     n1 = c1.next;
//     if(c1.data == x) {
//     break;
//     }
//     p1 = c1;
//     c1 = c1.next;
//     }

//     if(n1.data == y) {
//     if(head.data == x) {
//     head = n1;
//     } else {
//     p1.next = n1;
//     }

//     c1.next = n1.next;
//     n1.next = c1;
//     return;
//     }
//     Node c2 = head;
//     Node p2 = null, n2 = null;
//     while(c2 != null) {
//     n2 = c2.next;
//     if(c2.data == y) {
//     break;
//     }
//     p2 = c2;
//     c2 = c2.next;
//     }

//     if(head.data == x) {
//     head = c2;
//     c2.next = n1;
//     p2.next = c1;
//     c1.next = n2;
//     return;
//     }

//     p1.next = c2;
//     c2.next = n1;
//     p2.next = c1;
//     c1.next = n2;

    // System.out.println(p1.data);
    // System.out.println(c1.data);
    // System.out.println(n1.data);

    // System.out.println();

    // System.out.println(p2.data);
    // System.out.println(c2.data);
    // System.out.println(n2.data);
    // }

    public void swapNodes(int x, int y) {
        if (x == y)
            return;
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        SwapNodes sn = new SwapNodes();

        sn.swapNodes(9, 1);
        System.out.println();

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
