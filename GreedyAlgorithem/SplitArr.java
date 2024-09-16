public class SplitArr {
    /* We have an Array of N elements and a number K. (1 <= K <= N)
     * . Split the given array into K subarrays(they must cover the all the elements). the maximum subarray sum 
     * achievable out of k subarrys formed must be the minumum possible. find that possible subarray sum.
     * Sample input = Array[] = {1, 2, 3, 4}; k = 2;
     *  Sample output 4;   {1,2}, {3}, {4}
    */
    public static int ans = Integer.MAX_VALUE;
    public static void solve(int a[], int n, int k, int idx, int sum, int maxsum) {
        if(k == 1) { // k=1 is the base case
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for(int i=idx; i<n; i++) {
                sum += a[i];
            }
            // we update maxsum
            maxsum = Math.max(maxsum, sum);
            // the answer is stored in ans
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0; 
        // Using for loop to divide the array into K-subarray
        for(int i=idx; i<n; i++) {
            sum += a[i];
            // for each subarray we calculate sum ans update
            // maxsum
            maxsum = Math.max(maxsum, sum);
            // calling function again
            solve(a, n, k-1, i+1, sum, maxsum);
        }
    }

    public static void minSubArrSum(int arr[], int k, int n, int idx, int sum, int maxSum) {
        if(k==1) {
            maxSum = Math.max(sum, maxSum);
            sum = 0;
            for(int i=idx; i<n; i++) {
                sum += arr[i];
            }
            maxSum = Math.max(sum, maxSum);
            ans = Math.min(maxSum, ans);
            return;
        }
        sum = 0;
        // first getting sum of all possible subarrays
        for(int i=idx; i<n; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            minSubArrSum(arr, k-1, n, i+1, sum, maxSum);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int k = 3;
        int n = 4;
        solve(a, n, k, 0, 0, 0);
        // minSubArrSum(a, k, n, n, k, n);
        System.out.println(ans);
    }
}
