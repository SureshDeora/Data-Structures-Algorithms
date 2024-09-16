import java.util.ArrayList;
public class MonotonicAL {

    /*Monotonic ArrayList(Easy) = An ArrayList is monotonic if it is either monotone increasing or monotone decreasing
     * An ArrayList nums is monotone increasing if for all i<=j, 
     * An ArrayList nums is monotone decreasing if for all i>=j,
     * Given an integer Arraylist nums, return true if the given list is monotonic , or false otherwise.
     * 
     * Sample input : nums=[1,2,2,3]  Output : true
     * Sample input : nums=[6,5,4,4]  Output : true
     * Sample input : nums=[1,3,2]    Output : false
     * 
     */

     public static boolean checkMonotonicAl(ArrayList<Integer> list) {
         boolean inc = true;
         boolean dec = true;
         for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                inc = false;
            }
            if(list.get(i) < list.get(i+1)) {
                dec = false;
            }
         }
         return inc || dec;
     }

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
    //    list.add(1);
    //    list.add(2);
    //    list.add(2);
    //    list.add(3);

    //    list.add(6);
    //    list.add(5);
    //    list.add(4);
    //    list.add(4);

       list.add(1);
       list.add(3);
       list.add(2);
      
       System.out.println(checkMonotonicAl(list));
}
}