package HashMap;

import java.util.HashSet;

public class Union_Intersection {
    /*Question
     * Union & Intersection of 2 arrays
     * arr1 = {7, 3, 9}
     * arr2 ={6, 3, 9, 2, 9, 4}
     * 
     * union = 6{7, 3, 9, 6, 2, 4}
     * intersection = 2{3, 9}
     */
    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size() + " " + set);

        System.out.println();
        
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i]+ " ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection "+ count);
    }
}
