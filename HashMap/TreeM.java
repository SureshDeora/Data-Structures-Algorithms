package HashMap;

import java.util.TreeMap;

public class TreeM {
    public static void main(String args[]) {
        // Keys are sorted 
        // put, get, remove T.C O(logn);
        // Uses Red Black Trees for implementation
        TreeMap<String, Integer> tm = new TreeMap<>();
       tm.put("India", 150);
       tm.put("China", 100);
       tm.put("Us", 50);
       tm.put("Russia", 70);
       System.out.println(tm); // Output will be in alphabetical order --> china , india, russia, us
    }
}
