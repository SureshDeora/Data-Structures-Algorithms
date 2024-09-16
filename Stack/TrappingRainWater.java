import java.util.Stack;

public class TrappingRainWater {
    static int trappedWater(int[] height) {
        //nxt max right height
        Stack<Integer> s = new Stack<>();
        int len = height.length;
        //nxt max left height
        int[] nmr = new int[len];

        
        //nxt max right height
        for(int i=len-1; i>=0; i--) {
           while(!s.isEmpty() && height[i]>=s.peek()) {
            s.pop();
           }
           if(s.isEmpty()) {
            s.push(height[i]);
            nmr[i] = s.peek();
           } else {
            nmr[i] = s.peek();
            
           }
        } 
        // nxt max of left side
        int[] nml = new int[len];
        s = new Stack<>();
        for(int i=0; i<len; i++) {
            while(!s.isEmpty() && height[i]>= s.peek()) {
                s.pop();
            }
            if(s.isEmpty()) {
                s.push(height[i]);
                nml[i] = s.peek();
            } else {
                nml[i] = s.peek();
            }
        }      
        // for(int i : nml) System.out.print(i+" ");
        // Trapped Rain Water
        int totalTrappedWater = 0;
        for(int i=0; i<len; i++) {
            // water for each level
            int waterHeight = Math.min(nmr[i], nml[i]);
            int trapWater = waterHeight - height[i];
            totalTrappedWater += trapWater; 
        }
        return totalTrappedWater;
    }


        // /*
     public static int maxWater(int[] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;


        for (int i = 0; i < n; i++) {
            //when we have curr i is equal of right max of the top of stack.
        while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
            //this is curr element for which we will calculate waterlevel
        int pop_height = height[stack.peek()];
        //now poping that element to get left max of it, 
        stack.pop();
        // when we pop sometime our stack gets empty so we don't have left max of the element then will break
        // wihtout leftmax we can't calculater trappedwater
        if (stack.isEmpty())
        break;

        // calculating width for the curr
        int distance = i - stack.peek() - 1;
        // waterlevel where water can be stored, water height
        int min_height = Math.min(height[stack.peek()],height[i]) - pop_height;
        // total water that can be trapped
        // width * water height 
        ans += distance * min_height;
        }
        // else we will push idxs to stack
        stack.push(i);

        }
        return ans;
        }
        // */



    public static void main(String[] args) {
        int[] height = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        // System.out.println(trappedWater(height));
        System.out.println(maxWater(height));
    }
}
