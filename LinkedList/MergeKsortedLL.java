package LinkedList;

public class MergeKsortedLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
         this.data = data;
         this.next = null;   
        }
    }


    public static Node mergeKsortedll(Node arr[], int last) {
        // Here we are merging each two ll 1st and last.
        // every two sorted after merging will appear in starting ll
        // at the end 0 is will be the kSorted mearged ll .
        while(last != 0) {
            int i = 0 , j = last;
            while(i<j) {
                //here we are sending two ll and saving merged into starting
                arr[i] = mergell(arr[i], arr[j]);
                i++; j--;

                // if(i >= j) {
                //     last = j;
                // }
            } //updating our last value as j, because jth ll is not merged yet
             last = j;
        } //In the end we will be having an ll with all the k sorted ll into one.
        return arr[0];
    }
    private static Node mergell(Node a, Node b) {
        // node a and b are pointing the head of the both ll coming from the source
        // when we have any ll is empty, returning second one; 
        if(a == null) {
            return b;
        } else if(b == null) {
            return a;
        }

        // result will be our temp node to store both sorted ll accordingly
        Node result = null;
        // we are directly connecting node without making new;
        if(a.data <= b.data) {
            result = a;
            result.next = mergell(a.next, b);
           
        } else {
            result = b;
            result.next = mergell(a, b.next);
            
        }
        // at the end we have our two sorted ll merged into one;
        return result;
    }
    public static void main(String[] args) {
        int k = 3, n = 4;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKsortedll(arr, k-1);
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }


        // for(int i=0; i<k; i++) {
        //     Node temp = arr[i];
        //     // System.out.println(temp.data);
        //     while(temp != null) {
        //         System.out.print(temp.data+" ");
        //         temp = temp.next;
        //     }
            
        //     System.out.println();
        // }
    }
}
