public class StackUsingArray {
    static class MyStack {
        int[] arr;
        int size;
        int idx;
        MyStack(int n) {
            arr = new int[n];
            size = n;
            idx = -1;
        }
        // Push
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is Full! ");
            return;
        }
        arr[++idx] = data;
    }
        // Peek
    public int peek() {
        if(idx == -1) {
            System.out.println("Stack is Empty! ");
            return Integer.MIN_VALUE;
        }
        return arr[idx];
    }
        // Pop
    public int pop() {
        if(idx == -1) {
            System.out.println("Stack is Empty! ");
            return Integer.MIN_VALUE;
        }
        int top = arr[idx];
        arr[idx] = 0;
        idx = idx-1;
        return top;
        
    }
        // isEmpty
        public boolean isEmpty() {
            return idx == -1;
        }
        //display
        public void display() {
            if(isEmpty()) {
                System.out.println(" Stack is Empty! ");
                return ;
            }
            for(int i=0; i<=idx; i++) {
                System.out.print(arr[i]+" ");
            } System.out.println();
        }
        // is Full
        public boolean isFull() {
            return idx == arr.length-1;
        }
    }
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        // System.out.println(st.isEmpty());
        // System.out.println(st.peek());
        st.push(1);
        // System.out.println(st.isEmpty());
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6); // Stack OverFlow
        
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        
        // st.display();
    }
}
