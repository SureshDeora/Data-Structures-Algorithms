import java.util.Stack;
public class PalindromLL {
    static class Node {
        int data;
        Node ptr;
        Node(int data) {
            this.data = data;
            this.ptr = null;
        }
    }

    public static boolean palindrom(Node head) {
        Stack<Integer> s = new Stack<>();

        // size 
        Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.ptr;
        }

        int mid = size/2;
        temp = head;
        if(size%2 == 0) {
            while(mid != 0) {
                s.push(temp.data);
                temp = temp.ptr;
                mid--;
            }
            while(!s.isEmpty()) {
                if(temp.data != s.pop()) {
                    return false;
                }
                temp = temp.ptr;
            }
        } else {
            while(mid != 0) {
                s.push(temp.data);
                temp = temp.ptr;
                mid--;
            }
            while(!s.isEmpty()) {
                temp = temp.ptr;
                if(temp.data != s.pop()) {
                    return false;
                }
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(2);
        Node f = new Node(1);
        a.ptr = b; b.ptr = c; c.ptr = d; d.ptr = e; e.ptr = f;
        System.out.println(palindrom(a));

    }
}