public class BalancedString {
    /* Maximum Balanced String Partitions
     * We have balance string str of size N with an equal number of L and R
     * the task is to find a maximum number x, such that a given string can be 
     * partitioned int X balanced substing. A string is called to be balanced if the number of L's in the
     * string equals the num of R's
     * for ex input str = LRRRRLLRLLRL
     * output 3;
     */

     public static void balancedStr(String str, int n) {
        int r=0, l=0;
        int ans=0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'L') {
                l++;
            } else if(str.charAt(i) == 'R') {
                r++;
            }
            if(l == r) {
                ans++;
            }
        }
        System.out.println(ans);
     }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        balancedStr(str, str.length());
    }
    
}
