public class SubArr {
// /*    
 public static void subArr(int num[]) {
        int currSum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += num[k];
                    //System.out.print(currSum + " ");
                    System.out.print(num[k] + " ");

                }
                System.out.println();
                count++;
                if(max < currSum) {
                    max = currSum;
                }
            }
        } System.out.println(max);
        //System.out.println(count);
    }
// */


public static void prefixArrSum(int num[]) {
    int currSum = 0;
    int max = Integer.MIN_VALUE;
        int prefixArr[] = new int[num.length]; 
        prefixArr[0] = num[0];
    for(int i = 1; i < prefixArr.length; i++) {
        prefixArr[i] = num[i] + prefixArr[i-1];
    }
    for(int i = 0; i < prefixArr.length; i++) {
        System.out.print(prefixArr[i] + " ");
    }
    int len = num.length;

    for(int i = 0; i < len; i++) {
        
        for(int j = i; j < len; j++) {
            // when i=0 then the current j value is our Cursum of subarr
            currSum = (i == 0? prefixArr[j] : prefixArr[j] - prefixArr[i-1]);
            if(max < currSum) {
                max = currSum;
            }

        }
    }
    System.out.print(max);
    
}
// /*
public static void kadanes(int num[]) {
    int currSum = 0;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < num.length; i++) {
        currSum += num[i];
        if(currSum < 0) {
            currSum=0;
        }
        max = Math.max(currSum, max);
    }
    System.out.print(max);
} 
// */


    public static void main(String args[]) {
        int num [] = {2,7,6,8,10};
    //    subArr(num);
       prefixArrSum(num);
    //    kadanes(num);

    }
    
}
