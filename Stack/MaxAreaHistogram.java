package Stack;
import java.util.Stack;

public class MaxAreaHistogram {
    public static int maxArea(int[] height) {
        Stack<Integer> s = new Stack<>();
        // right next smaller 
        int len = height.length;
        int[] nsr = new int[height.length];
        for(int i=len-1; i>=0; i--) {
            int curr = height[i];
            while(!s.isEmpty() && curr <= height[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = len;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        

        // next smaller left

        int[] nsl = new int[len];
        s = new Stack<>();
        for(int i=0; i<len; i++) {
            int curr = height[i];
            while(!s.isEmpty() && curr<=height[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // for(int i:nsl) {
        //     System.out.print(i);
        // }

        //Calculating Area of each Histogram and returning max One;
        int maxArea = 0;
        for(int i=0; i<len; i++) {
           int width = nsr[i] - nsl[i] - 1;
           int area = height[i]*width;
           maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(height));
    }
}
