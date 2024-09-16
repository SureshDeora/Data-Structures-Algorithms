package Arrays;

public class PracticeArr {
    public static boolean checkRep(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] ==  arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findIndax(int arr[], int num) {
        for(int i=0; i<arr.length; i++) {
            if(num == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    // Stock Max Profit
    public static void maxProfit(int arr[]) {
        int maxProfit = 0;
        int buyPrice = arr[0];
        for(int i=1; i<arr.length-1; i++) {
            
            if(buyPrice > arr[i]) {
                buyPrice = arr[i];
            }
            int profit = arr[i+1] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.print(maxProfit);
    }





    //Trappint Rainwater

    public static void trapRainWater(int height[]) {
        int leftMax[] = new int[height.length]; 
        leftMax[0] = height[0];
        for(int i=1; i<leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }  
        // } for(int i=0; i<leftMax.length; i++) {
        //     System.out.print(leftMax[i]);
        // }
        
        
        //System.out.print(leftMax[i]+ " ");

        int rightMax [] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=rightMax.length-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        
        
        
        // for(int i=0; i<rightMax.length; i++) {
        //     System.out.print(rightMax[i]);
        
        int trappedWater = 0;
        for(int i=0; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        System.out.print(trappedWater);
    }


    public static void dupliTrip(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        System.out.print("{"+arr[i]+" " + arr[j] +" " + arr[k] +"}  ");
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        // String arr = "abcd";
        //int arr[]= {7,6,4,3,1};
        //int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int height[] = {4,2,0,3,2,5};
        // trapRainWater(height);

        int arr[] = {-1,0,1,2,-1,4};
        dupliTrip(arr);
        
        // int num = 0;
        //maxProfit(arr);
        // System.out.print(findIndax(arr, num));
    }
    
}
