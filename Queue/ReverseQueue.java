package Queue;
import java.util.*;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }


        // Queue<Integer> helper = new ArrayDeque<>();
        // while(!q.isEmpty()) {
        //     helper.add(q.remove());
        //     for(int i=1; i<=helper.size()-1; i++) {
        //         helper.add(helper.remove());
        //     }
        // }
        // while(!helper.isEmpty()) {
        //     q.add(helper.remove());
        // }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }

    }
    
}
