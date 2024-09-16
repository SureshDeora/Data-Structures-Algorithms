package Sorting;

public class Rivision {
    // public static void selectionSort(int sort[]) {
    //     for(int i=0; i<sort.length; i++) {
    //         int min = i;
    //         for(int j=i+1; j<=sort.length-1; j++) {
    //             if(sort[min] > sort[j]) {
    //                 min = j;
    //             }
    //         }
    //         int temp = sort[min];
    //         sort[min] = sort[i];
    //         sort[i] = temp;
    //     }
    // }
    
    
    public static void rivisionBubble(int sort[]) {
        for(int turn=0; turn<sort.length-1; turn++) {
            for(int i=0; i<sort.length-1-turn; i++) {
                if(sort[i] < sort[i+1]) {
                    int temp = sort[i+1];
                    sort[i+1] = sort[i];
                    sort[i] = temp;
                }
                
            }
        }
    }
    public static void print(int sort[]) {
        for(int i=0; i<sort.length; i++) {
            System.out.print(sort[i]+ " "); 
        }
    }
    public static void main(String args[]) {

        int sort[] = {5,3,1,4,2};
        rivisionBubble(sort);
        //selectionSort(sort);
        print(sort);
        
    }
    
}
