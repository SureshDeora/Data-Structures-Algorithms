public class PairArr {
    public static void pairsArr(int num[]) {
        int count =0;
        for(int i = 0; i < num.length; i++) {
            
            for(int j = i+1; j < num.length; j++) {
                System.out.print("("+ num[i] +"," + num[j] +")  ");
                count++;
            }
            System.out.println();
            
        }
        System.out.print(count);
    }


    public static void main(String args[]) {
        int num [] = {2,4,6,8,10,12,14,16,18};
        pairsArr(num);
    }
    
}
