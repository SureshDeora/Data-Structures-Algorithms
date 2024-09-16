public class StockProfit {
    
    public static int stockProfit(int stockPrice[]) {
        
        int buyPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<stockPrice.length; i++) {
            if(buyPrice < stockPrice[i]) {
                int profit = stockPrice[i] - buyPrice;
                max = Math.max(max, profit);
            } else {
                buyPrice = stockPrice[i];
            }

        } return max;
    }
public static void main(String args[]) {
    int stockPrice[] = {7,1,5,3,6,4};
    System.out.print(stockProfit(stockPrice));
}
    
}
