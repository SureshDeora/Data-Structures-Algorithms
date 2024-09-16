import java.util.*;
public class IndianCoin {
    /* We are given an infinity supply of demonstration of 
     * Indian notes/coins 2, 5, 10, 20, 50, 100, 200, 500, 2000
     * Find min no of coin to make for a value v
     * v = 121
     * ans = 3{100 + 20 + 1}
     * 
     */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Arrays.sort(arr, Comparator.reverseOrder());
        int value = 121;
        int coins = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= value) {
                while(arr[i]<=value) {
                    coins++;
                    value -= arr[i];
                    list.add(arr[i]);
                }
            }
            
        } System.out.println(coins+""+list);
        
    }
    
}
