package Stack;
import java.util.*;
public class StockSpan {
    /* Max no. of consecutive days for which price <= today's price */
    public static int[] stockSpan(int[] stock) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[stock.length];
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stock.length; i++) {
            int currPrice = stock[i];
            while(!s.isEmpty() && stock[i]>=stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1 ;
            } else {
                span[i] = i-s.peek();
            }
            s.push(i);
        }
        return span;
        
    }
    public static void main(String[] args) {
    int[] stock = {100, 80, 60, 70, 60, 85, 100};
    int[] span = stockSpan(stock);
        for(int i=0; i<span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
