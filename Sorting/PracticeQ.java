package Sorting;

public class PracticeQ { 
 /*   public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) 
        {
            for(int j=0; j<arr.length-1-i; j++) 
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
 */

 /*   public static void selectionSort(int arr[]) 
    {
        for(int i=0; i<arr.length-1; i++) 
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++) 
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
 */

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }



    public static void countSort(int arr[])
    {
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            large = Math.max(large, arr[i]);
        }


        int count []= new int[large+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        } 

        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
             arr[j] = i;
             count[i]--;
             j++;   
            }
         
            
        }
    }

    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }















    
    public static void main(String args[]) {
        int arr[] = {3,6,2,1,8,7,1,2,2};
       // bubbleSort(arr);
        //selectionSort(arr);
        // insertionSort(arr);
        countSort(arr);
        print(arr);
    }
    
}
