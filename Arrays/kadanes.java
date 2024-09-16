/* Max SubArray Sum  */
public class kadanes {
    public static int kadanes(int num[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum += num[i];
            if(sum < 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    } 
    public static void subArrSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int num[] =  {1, 2, 3 , 4, 5, 6};
        // System.out.print(kadanes(num));
        subArrSum(num);
    }
    
}
