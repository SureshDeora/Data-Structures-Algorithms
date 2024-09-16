import java.util.Queue;
import java.util.LinkedList;
public class StackUsingQueue {
   static class MyStack {
    Queue<Integer> q ;

    MyStack() {
        q = new LinkedList<>();
    }

/*    // Push efficient 
    // Push O(1)
    public void push(int data) {
        q.add(data);
    }
    //Peek O(n)
    public int peek() {
        if(q.size() == 0) {
            System.out.println("Stack is empty!"); 
            return -1;
        }
        for(int i=1; i<=q.size()-1; i++) {
            q.add(q.remove());
        }
        int top = q.peek();
        q.add(q.remove());
        return top;
    }
    //Pop O(n)
    public int pop() {
         if(q.size() == 0) {
            System.out.println("Stack is empty!"); 
            return -1;
        }
        for(int i=1; i<=q.size()-1; i++) {
            q.add(q.remove());
        }
        int top = q.remove();
        
        return top;

    }
    // Is Empty
    public boolean isEmpty() {
        return q.size() == 0;
    }
*/
    /* Pop efficient */ 
    // Push O(n)
    public void push(int data) {
        q.add(data);
        for(int i=1; i<=q.size()-1; i++) {
            q.add(q.remove());
        }
    }
    // Peek O(1)
    public int peek() {
        if(q.size() == 0) {
            System.out.println("Stack is empty!"); 
            return -1;
        }
        return q.peek();
    }
    // Pop O(1)
    public int pop() {
        if(q.size() == 0) {
            System.out.println("Stack is empty!"); 
            return -1;
        }
        return q.remove();
    }
    // isEmpty O(1)
    public boolean isEmpty() {
        return q.size() == 0;
    }
   } 
   public static void main(String[] args) {
    MyStack st = new MyStack();
    System.out.println(st.isEmpty());
    st.push(1);
    System.out.println(st.isEmpty());
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st.pop());
    // System.out.println(st.peek());
    while(!st.isEmpty()) {
        System.out.print(st.pop()+" ");
    }
   }
}
