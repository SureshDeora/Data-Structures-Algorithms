public class RivisionDSA {
// public static int trappedWater(int height[]) {
//     int leftMax [] = new int[height.length];
//     leftMax[0] = height[0];
//     for(int i = 1; i<leftMax.length; i++) {
//         leftMax[i] = Math.max(height[i], leftMax[i-1]);
//     }
//     int rightMax [] = new int[height.length];
//     rightMax[rightMax.length-1] = height[height.length-1];
//     for(int i=rightMax.length-2; i>=0; i--) {
//         rightMax[i] = Math.max(height[i], rightMax[i+1]);
//     }


//     int trappedWater = 0;
//     for(int i=0; i<height.length; i++) {
//         int waterLevel = Math.min(rightMax[i], leftMax[i]);
//         trappedWater += waterLevel-height[i];
//     }
//     return trappedWater;
// }



public static int stockPrice(int price[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0; i<price.length; i++) {
        if(buyPrice<price[i]) {
        
        int profit = price[i]-buyPrice;
        maxProfit = Math.max(profit, maxProfit);
        }
        else {
            buyPrice = price[i];
        }
        

    } return maxProfit;
}











 /*   public static void reverseArr(int num[]) {
        int start = 0, end = num.length-1;
        while(start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            
            
            start++;
            end--;
        }
        
    } */
// public static void reverseArr(int num[]) {
//     int start =0, end = num.length - 1;
//     for(int i = start; i < end; i++) {
//         int temp = num[start];
//         num[start] = num[end];
//         num[end] = temp;
//         start++;
//         end--;
//     }
// }


    


    /*
    public static int findKey(int num[], int key) {
        int start = 0, end = num.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(key == num[mid]) {
                return mid;
            }
            if(key < num[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;

    } */


    // public static void pairArr(int num[]) {
    //     for(int i = 0; i < num.length; i++) {
    //         for(int j = i+1; j < num.length; j++) {
    //             System.out.print("("+ num[i] +"," + num[j] +") ");
    //         }
    //         System.out.println();
    //     }
    // }






    // public static void subArr(int num[]) {
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0;
    //     for(int i = 0; i<num.length; i++) {
    //         for(int j=i; j<num.length; j++) {
    //             sum=0;
    //             for(int k=i; k<=j; k++) {
    //                 sum = sum+num[k];
    //                 if(max < sum) {
    //                     max = sum;
    //                 }
                    
                    
    //             }System.out.print(sum +" ");
    //             System.out.println();

    //         }
            
    //     }
    //     System.out.println(max);
    // }



    // public static void TrappedRain(int height[]) {
    //     int n = height.length;
    //     int leftMax [] = new int[height.length];
    //      leftMax [0] = height[0];
    //      for(int i=1; i<n; i++) {
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //      }

    //      int rightMax[] = new int[height.length];
    //      rightMax [rightMax.length-1] = height[height.length-1];
    //      for(int i=n-2; i>=0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //      }
    //      int trappedWater = 0;
    //      for(int i=0; i<n; i++) {
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
    //         trappedWater += waterLevel - height[i];

    //      }
    //      System.out.print(trappedWater);
    // }




    // public static void prefixArrSum(int num[]) {
    //     int prefixArr[] = new int[num.length];
    //     prefixArr[0] = num[0];
    //     int prefixSum = 0;
    //     for(int i = 1; i<prefixArr.length; i++) {
    //         prefixArr[i] = num[i] + prefixArr[i-1];
    //     }
    //     // for(int i=0; i<prefixArr.length; i++) {
    //     //     System.out.print(prefixArr[i]);
    //     // }
    //     for(int i=0; i<num.length; i++) {
    //         for(int j=i; j<num.length; j++) {
    //             prefixSum = i==0? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
    //             System.out.print(prefixSum);
    //             System.out.println();
    //         }
    //     }
        
       
        

    // }



    // public static void kadanes(int num[]) {
    //     int sum = 0;
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<num.length; i++) {
    //         sum += num[i];
    //     if(sum < 0) {
    //         sum=0;
    //     }
    //     max = Math.max(max, sum);

    //     }System.out.print(sum);
    // }

    public static void main(String args[]) {



        int price[] = {7,1,5,3,6,4};
        System.out.print(stockPrice(price));
        // int heigth []={4,2,0,6,3,2,5};
        // System.out.print(trappedWater(heigth));
        // int num[] = {2,6,7,5,78,86,4,32,46,67};
        // reverseArr(num);
        // for(int i = 0; i < num.length; i++) {
        //     System.out.print(num[i] + " ");
            
        // }
        
// int num [] = {2,3,5,6,7,8,9};
// reverseArr(num);
// for(int i = 0; i<num.length; i++) {
//     System.out.print(num[i]+ " ");
// }


// int num [] = {2,3,4,5,6,7,8,9};
// pairArr(num);



// int num[] = {2,3,5,6,7,8,9};
// int key = 7;

// int num[] = {2,4,6,8,10};
// subArr(num);
//int num[] = {1,2,3,4,5};
          //{1,3,6,10,15}
// prefixArrSum(num);
//kadanes(num);

// int height []={4,2,0,6,3,2,5};
// TrappedRain(height);



        /*
        int num [] = {3,6,9,12,14,22,34,56,65,78,89,99};
        int key = 76;
        System.out.print(findKey(num, key)); */
    }
}
