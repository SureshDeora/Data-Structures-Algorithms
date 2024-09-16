package LinkedList;

import javax.swing.plaf.synth.SynthButtonUI;

public class OddEvenLL {
    public static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static Node evenOddLL(Node head) {
        Node newLL = new Node(-1);
        Node newHead = newLL;
        Node temp = head;
        while(temp != null) {
            if(temp.data % 2 == 0) {
                newHead.next = new Node(temp.data);
                newHead = newHead.next;
            }
            temp = temp.next;
        }
        
        
        temp = head;
        while(temp != null) {
            if(temp.data % 2 != 0) {
                newHead.next = new Node(temp.data);
                newHead = newHead.next;
            }
            temp = temp.next;
        }

        
        return newLL.next;
    }


    public static void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        //we will shift our odd element to end of the ll
        //getting our end Node, so after that we can move our odd Nodes
        while (end.next != null)
            end = end.next;

            //we will preserve our end variable
        Node new_end = end;

        // shifting our all the odd Nodes before getting first even Node 
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        // Above loop will end at Node which has even data and from this Node our new ll will be created
        // So assigning head to the node
        if (curr.data % 2 == 0) {
            head = curr;
            // Now making connection between even nodes and shifting the odd node to next of end
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else
            prev = curr;
            //when we have rest last end node to be checked 
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }
        
    public static void main(String[] args) {
     
        int k = 3;
        head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);
        // head.next.next.next.next.next.next.next.next = new Node(9);
        // head.next.next.next.next.next.next.next.next.next = new Node(10);

        

        
         Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } System.out.println();

        // temp =  evenOddLL(head);
        segregateEvenOdd();
        temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}
