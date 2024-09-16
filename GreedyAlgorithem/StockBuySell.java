import java.util.*;
public class StockBuySell {
    public static int maxProfit(int[] stock) {
        int buyPrice = stock[0];
        int maxProfit = 0;
        for(int i=1; i<stock.length; i++) {
            if(stock[i]<buyPrice) {
                buyPrice = stock[i];
            } else {
                int currProfit = stock[i]-buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] stock = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(stock));
    }
}
