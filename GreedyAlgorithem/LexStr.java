import java.util.*;
public class LexStr {
    /* We have two integer N and K. The task is to print the lexicographically smallest string of length
     * N consisting of lower case English alphabets such that the sum of the characters of the 
     * string equals to K where 'a' = 1; 'c' = 3.....and 'z' = 26;
     * N = 3, K = 25
     * output aaw;
      */

      public static char[] lexo_small(int n, int k) {
        char arr[] = new char[n]; // 5 
        // Arrays.fill func is used to fill the whole arr with given value
        // or we can fill for perticular indexes too -> Arrays.fill(idx, to idx, value)
        Arrays.fill(arr, 'a');
        // i = 4
        // System.out.println(Arrays.toString(arr));
        // i= 4
        for(int i=n-1; i>=0; i--) {
            k -= i; // k = 42-4 = 38
            if(k >= 0) {
                if(k>=26) {
                    arr[i] = 'z';
                    k-=26;
                } else {
                    arr[i] = (char) (k+97-1);
                    k -= arr[i]-'a'+1;
                }
            } else break;
            
            k += i;

        }
        return arr;
      }
    public static void main(String[] args) {
        int n = 3, k = 6;
        char arr[] = lexo_small(n, k);
       System.out.println(Arrays.toString(arr));
    }   
}
