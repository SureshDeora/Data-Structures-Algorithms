package LinkedList;

public class LinkedList {

    // Every Node is a member of class Node
    // Every Node store two values, Data and next node reference address
    // Using Constructer to add data and next node address in every Node that is created
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // First Node of LL is called Head and last as Tail
    public static Node head;
    public static Node tail;
    public static int size;

    public void insertAtHead(int val) {
        size++;
        // step 1 = create new node 
        Node newNode = new Node(val);
        // if our ll is empty.
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // Linking our newNode to head then making it head
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        size++;
        Node newNode = new Node(val);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    public void insertAt(int idx, int val) {
        if(idx == 0) {
            insertAtHead(val);
            return;
        } 
        else if(idx == size) {
            insertAtEnd(val);
            return;
        } 
        else if(idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
    
        size++;
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1; i<=idx-1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void removeAt(int idx) {
        if(idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }
        else if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        else if(idx == 0) {
            head = head.next;
            size--;
            return;
        } 
        
        Node temp = head;
        for(int i=1; i<=idx-1; i++) {
            temp = temp.next;
        }

        if(idx == size-1) {
            tail = temp;
        }

        temp.next = temp.next.next;
            size--;

    }

    public void display() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
        System.out.print(temp.data+"->");
        temp = temp.next;
        }
        System.out.println("null");
    }

    // Key search in Linkedlist using loop
    public static int search(int key) {
        Node temp = head;
        for(int i=0; i<size; i++) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    // Key/Element search in Linkedlist using recursion.
    public static int searchRec(Node head, int key) {
        
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = searchRec(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }

    // Reverse A LinkedList 
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void removeNthFromEnd(int n) {

        //we will convert from end to to start to using this
        //formula size-n+1 
            /*  3 -> 5 -> 1 -> 6 -> 8 -> null */

            if(n==size) {
                head = head.next;
                return;
            }

        int prevNode = size-n;
        Node temp = head;
       
        for(int i=1; i<prevNode; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        if(n==1) {
            tail = temp;
            return;
        }

    }

    // Check palindrom linked list
    // Find mid of any Linkedlist
    public Node findMid(Node head) {
        
        Node slow = head;
        Node fast = head;
        // it'll run if both values are true, if one of them false , exit the loop
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom() {
        if(head == null || head.next == null) {
            return true;
        }
        Node prev = null; 
        Node curr = findMid(head);
        Node next ;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        while(rightHead.next !=null) {
            if(leftHead.data != rightHead.data) {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        } 
        return true;
    }

    // Floyd's cycle/loop detecting algorithm

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Detecting cycle and removing in a LL
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false; 
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        slow = head;
        Node prevNode = null;
        while(slow.next != fast.next) {
            prevNode = fast;
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // ll.display();
        
        ll.insertAtHead(5);
        ll.insertAtHead(4);
        ll.insertAtEnd(9);
        ll.insertAtEnd(1);
        ll.insertAtEnd(7);
        ll.insertAt(2, 6);
        // tail.next = head.next.next;
       // System.out.println(ll.size);
       // ll.display();
        //System.out.println(search(8));
        // System.out.println(searchRec(head, 6));
        // System.out.println(head.data);
        
        // ll.removeAt(0);
        
       // ll.reverse();
        // ll.display();
        // ll.removeNthFromEnd(1);
        // ll.display();
        // System.out.println(head.data);
        // System.out.println(tail.data);
        //System.out.println(ll.checkPalindrom());

    /*    
        // Floyd's loop/cycle finding algorithem
        head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
         head.next.next.next.next = new Node(5);
        //  head.next.next.next.next.next = new Node(5);
         head.next.next.next.next.next = head.next.next;
         
        // Node temp = head;
        // while(temp!=null) {
        //     System.out.print(temp.data+ " ");
        //     temp = temp.next;
        // }
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        } 
         */
        ll.display();
         System.out.println(ll.findMid(head).data);
    }
    
}
