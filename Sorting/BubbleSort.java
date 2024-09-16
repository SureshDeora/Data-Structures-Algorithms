package Sorting;

public class BubbleSort {
    
        public static void sortArr(int sort[]) {
            int count;
            for(int turn=0; turn<=sort.length-2; turn++) {
                //count =0;
                for(int j=0; j<=sort.length-2-turn; j++) {
                    if(sort[j] > sort[j+1]) {
                        int temp = sort[j];
                        sort[j] = sort[j+1];
                        sort[j+1] = temp;
                        //count++;
                    }
                } //System.out.println(count );
            }
            
        }
        public static void print(int sort[]) {
            for(int i=0; i<sort.length; i++) {
                System.out.print(sort[i]+ " ");
            }
        }
    public static void main(String args[]) {
        int sort[] = {2,1,6,3,4,5};
        sortArr(sort);
        print(sort);
    
    }
    }
    

