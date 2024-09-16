package Sorting;

public class Insrtion {
    public static void insertionSort(int sort[]) {
        for(int i=1; i<sort.length; i++)  {
            int curr = sort[i];
            int prev = i-1;
            while(prev>=0 && sort[prev] > curr) {// Every greater element will be placed at next to it
                sort[prev+1] = sort[prev];
                prev--;
            }
            sort[prev+1] = curr; // smaller element will get it right position
        }
    }
    public static void print(int sort[]) {
        for(int i=0; i<sort.length; i++) {
            System.out.print(sort[i]);
        }
    }
    public static void main(String args[]) {
        int sort[] = {1,4,2,1,5};
        insertionSort(sort);
        print(sort);

    }
    
}
