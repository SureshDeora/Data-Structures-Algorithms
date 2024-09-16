import java.util.ArrayList;
import java.util.Collections;
public class ArrayListBasics  {

     public static void main(String[] args) {

         //basicUtils();

        //  Max of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7); 
        list.add(1);
        list.add(9);
        list.add(5);
       // System.out.println(findMax(list));

       // Swap two num in ArrayList
        int idx1 = 2, idx2=4;
        // swapNum(list, idx1, idx2);
        // System.out.println(list);

        // Sorting an ArrayList Ascending and Descending order
        //sortAL(list);

        // Multi Dimential ArrayList
        mdAL();
}

public static void mdAL() {
    // 2d ArrayList Declaration
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1); list1.add(2);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3); list2.add(4);

    // Adding two above lists to the mainList
    mainList.add(list1);
    mainList.add(list2);

    // iteration on 2d ArrayList
    for(int i=0; i<mainList.size(); i++) {
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0; j<currList.size(); j++) {
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }

    System.out.println(mainList);

}
public static void sortAL(ArrayList<Integer> list) {

    //Ascending order
    Collections.sort(list);
    System.out.println(list);
    //Descending order     //Collections.reverseOrder() is a Comparator to logic define at func
    Collections.sort(list, Collections.reverseOrder()); 
    System.out.println(list);
}

public static void swapNum(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
}
    public static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            /*if(list.get(i)>max) {
                max=list.get(i);
            } */

            max=Math.max(max, list.get(i));
        }
        return max;
    }

    public static void basicUtils() {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Character> list4 = new ArrayList<>();

        //Operation on ArrayList
        // Add O(1) :- add elements in a list
        // Syntax name.add(element);
        list.add(1);
        list.add(2); 
        list.add(3);
        list.add(4);
        list.add(5);
        // Add O(n) :- name.add(idx, element) = to add element at index
        list.add(3, 6);

        // Print ArrayList
        System.out.println(list);
        
        // Get O(1):- get element of the index
        // arr[i] == list.get(i)
        int element = list.get(3);
        System.out.println(element);

        // Delete O(n) :- To delete element from a list
        list.remove(3);
        System.out.println(list);

        // Set O(n) :- To set element at index = Replace the element at index
        list.set(3, 6);
        System.out.println(list);

        // Contains O(n) :- To check element if it exist in list
        // return True or False
        System.out.println(list.contains(3));
        System.out.println(list.contains(7));

        // Length of an ArrayList
        // arr.length{property} == list.size() {Method/Function};
        System.out.println("Length is " +list.size());

        // Printing ArrayList using loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
    
}