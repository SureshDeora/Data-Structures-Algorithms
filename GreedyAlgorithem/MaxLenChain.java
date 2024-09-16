import java.util.*;
public class MaxLenChain {
    /* You're given n pairs of number,  In every pair, the first number is always smaller then the second num. 
     * A Pair (c, d) can come after pair(a, b) if b<c
     * 
     */
    public static void main(String[] args) {
        int[][] pairs = {{5, 24},{39, 60},{5, 28},{24, 40},{50, 90}};
        Arrays.sort(pairs, Comparator.comparingDouble(i -> i[1]));
        int chainLen = 1;
        int last = pairs[0][1];
        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] >= last) {
                chainLen++;
                last = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
    
}
