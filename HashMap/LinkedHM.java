package HashMap;
import java.util.*;
// import java.util.LinkedHashMap;

public class LinkedHM {
    public static void main(String args[]) {
        // Linked HashMap has all the functions and methods of HashMap, B
        // But the difference is LHM output value same order of insertion while HM doesn't follow any order.
        // Uses Doubly linkedList while implementation
       LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
     
       lhm.put("India", 150);
       lhm.put("China", 100);
       lhm.put("Us", 50);
       lhm.put("Russia", 70);
       System.out.println(lhm); // Output will be in same order as we inserted

       System.out.println();

       HashMap<String, Integer> hm = new HashMap<>();
       hm.put("India", 150);
       hm.put("China", 100);
       hm.put("Us", 50);
       hm.put("Russia", 70);
       System.out.println(hm); // Outputs in random order
    }

}
