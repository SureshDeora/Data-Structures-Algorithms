package LinkedList;

public class Basicsll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        // Node x = new Node();
        // System.out.println(x); // address of the Node
        // System.out.println(x.next);  // will print null.

        /* Creating a Linkedlist manually
         Node is a member of linkedlist which store two value
         Data and address of next Node*/
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(6);

        /*Once node created, we have to link them then it'll be called as LinkedList
         * 1st Node is called Head and last as Tail.
         * last Node will not be connected to any Node, by default it'll point to null.
         */
        a.next = b;
        b.next = c;
        c.next = d;
    /*  3 -> 5 -> 1 -> 6 -> null */
        // Printing the ll
   /*    System.out.println(a.data);
        System.out.println(b.data);
        //we can print whole ll if we have 1st Node (Head) ,
        System.out.println(a.next.data); //it'll also print b node data, because a.next is actually b Node and so on
        System.out.println(a.next.next.data);  // C Node
        System.out.println(a.next.next.next.data); // D Node

        */

      /*   // When we know head and size , using for loop
        Node temp = a;
        for(int i=1; i<=4; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }*/
        //when we have head only , using while loop
        Node temp = a;
        while(temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
