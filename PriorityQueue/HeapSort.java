package PriorityQueue;

public class HeapSort {
    public static void heapSort(int arr[]) {
        int n = arr.length;
        for(int i=n/2; i>=0; i--) {
            heapify(i, n, arr);
        }
        for(int i=n-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(0, i, arr);
        }
    }
    public static void heapify(int i, int size, int arr[]) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left < size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }
        if(right < size && arr[maxIdx] < arr[right]) {
            maxIdx = right;
        }
        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(maxIdx, size, arr); 
        }
    }






    public static void main(String[] args) {

        int arr[] = {3, 21, 42, 2, 1, 5, 6};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
