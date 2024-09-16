package Sorting;

public class SelectionSort {
    public static void selectionSort(int sort[]) {
        for(int i=0; i<=sort.length-2; i++) {
            int min = i;
            for(int j=i+1; j<sort.length; j++) { //first find min from i to lan
                if(sort[min] > sort[j]) {
                    min = j;
                }
            } //then swap it with ith positoin, mean placing it to right position
            int temp = sort[min];
             sort[min] = sort[i];
             sort[i] = temp;
            
        }
    }
    public static void print(int sort[]) {
        for(int i=0; i<sort.length; i++) {
            System.out.print(sort[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int sort[] = {5,4,1,3,2};
        selectionSort(sort);
        print(sort);
    }
    
}
