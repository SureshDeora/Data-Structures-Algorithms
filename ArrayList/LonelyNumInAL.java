import java.util.ArrayList;
import java.util.Collections;
public class LonelyNumInAL {
    /* Lonely number in ArrayList(Medium) : You're given an integer ArrayList nums, 
    * A number is lonely when it appears only, and no adjacent number(i.e x+1 and x-1) appear in the ArrayList.
    * Return all lonely numbers in nums, You may return the answer in any order.

    Sample input : nums = [10, 6, 5,8]  Output : [10, 8]
    Sample input : nums = [1, 3, 5, 3]  Output : [1, 5]

    */
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        // list.add(5);
        // list.add(6);
        // list.add(8);

        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(3);



        //System.out.println(list);
        System.out.println(lonelyNum(list));
        System.out.println(list);
    }

    
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> list) {
        // We created a separate AL to store lonely only elements.
        ArrayList<Integer> lonelyEle = new ArrayList<>(); 
        // Sorting our list so we can easily identify it's neighbours
        Collections.sort(list);
        // List = [5, 6, 8, 10]

        // If our Arraylist has only single element
        if(list.size()==1) {
            lonelyEle.add(list.get(0)); 
           return lonelyEle;
        }

        // Checking for neighbour for the first element from the list and storing in lonely AL
        // We are checking this separatly because it can have only one side neighbour.
        if(list.get(1)-list.get(0) > 1) {
            lonelyEle.add(list.get(0));
        }

        // Checking neighbours for the rest elements in both side right and left.
        for(int i=1; i<list.size()-1; i++) {
            int currNum = list.get(i);
            if(currNum - list.get(i-1) > 1 && list.get(i+1)- currNum > 1) {
                 lonelyEle.add(list.get(i));
            }
        }
        // As well we are checking for the last element separatly
        if(list.get(list.size()-1) - list.get(list.size()-2) > 1) {
            lonelyEle.add(list.get(list.size()-1));
        }

        return lonelyEle;
    }
    

}
