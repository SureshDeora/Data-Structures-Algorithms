package Stack;
import java.util.ArrayList;
import java.util.Stack;
public class StackImplementation {

    // Stack using LinkedList
/*   static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
         }  */
        //  public static class Stack {

            //LinkedList
            //isEmpty
/*            static Node head = null;
            public static boolean isEmpty() {
                return head == null;
            }
            //Push
            public static void push(int data) {
                Node newNode = new Node(data);
                if(isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            //Pop
            public static int pop() {
                if(isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }
            //Peek
            public static int peek() {
                if(isEmpty()) {
                    return -1;
                }
                return head.data;
            }   
            */

        // Stack using Arraylist
/*        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // Push 
        public static void push(int data) {
            list.add(data);
        }
        // Pop
        public static int pop() {
            if(list.size() == 0) return -1;

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // Peek
        public static int peek() {
            if(list.size() == 0) {
                return -1;
            }
            return list.get(list.size()-1);
        }
*/
        
        
        
    // }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(3);
        // s.push(6);
        // s.push(10);
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();

       //System.out.println(s.peek());
    //      while(!s.isEmpty()) {
    //             System.out.println(s.peek());
    //             s.pop();
                
    //         }
    //         System.out.println(s.isEmpty());


/* Stack Implementation using Java collection framework */

        Stack<Integer> s = new Stack<>();
        s.push(1); // to add any element in stack
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("size = "+s.size()); //size of the stack
        System.out.println(s); // print whole stack
        // s.pop(); // remove last added element
        // s.peek() // get last added element
        // s.isEmpty(); // true if stack is empty
        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // Stack underflow
        s.pop(); // 1, 2, 3, 4
        s.pop(); // 1, 2, 3
        s.pop(); // 1, 2
        s.pop(); // 1
        s.pop(); // empty
        s.pop(); //underflow
        s.peek(); // underflow

        






    }


    
    
}
