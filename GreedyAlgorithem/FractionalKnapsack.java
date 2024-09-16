import java.util.*;
public class FractionalKnapsack {

    /* Fractional Knapsack 
     * You're given the weight and values of N items, Put these items to a 
     * knapsack of capcity W to get the maximum total value in the knapsack
     * value [] = {60, 100, 120}
     * weight[] = {10, 20 ,30}
     * W = 50;
    */
    
    public static void main(String[] args) {
       int val [] = {60, 100, 120};
       int weight[] = {10, 20 ,30};
       int w = 50;

       // lets get first ratio of each and every item
       double ratio[][] = new double[val.length][2];
       for (int i = 0; i < ratio.length; i++) {
        ratio[i][0] = i;
        ratio[i][1] = (double)val[i]/weight[i];
        
       }
       // sort it 
       Arrays.sort(ratio, Comparator.comparingDouble(i -> i[1]));

       // Now filling our knapsack with maximum val of items
       int capacity = w;
       int totalVal = 0;
       for (int i = ratio.length-1; i>=0; i--) {
        int idx = (int)ratio[i][0];
        if(weight[idx] <= capacity) {
            totalVal += val[idx];
            capacity -= weight[idx];
        } else {
            totalVal += ratio[i][1]*capacity;
            capacity = 0;
        }
       }
       System.out.println("Total Value of item added : "+ totalVal);


    }
}
