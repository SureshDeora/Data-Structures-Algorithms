package Stack;
import java.util.Stack;

public class NextGreaterElement {
    /* The next greater element any element x in an array 
     * is the first element that is to the right of x in same array
     * arr = [6,8,0,1,3]  nextGreater = [8, -1, 1, 3, -1]
     */

     public static int[] nextGreater(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int len = arr.length;
        for(int i=len-1; i>=0; i--) {
            int curr = arr[i];
            while(!s.isEmpty() && curr>=arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;

     }
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = nextGreater(arr);
        for(int i : nextGreater) {
            System.out.print(i + " ");
        }


        
    }
    
}
