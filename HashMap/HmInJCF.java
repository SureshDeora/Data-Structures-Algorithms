package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HmInJCF {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Put key value pairs in HashMap
        hm.put("India", 100); 
        hm.put("China", 90);
        hm.put("Us", 50);
        hm.put("Russia", 60);

        // To get value from HashMap
        System.out.println(hm.get("India")); // returns value to corresponding key
        System.out.println(hm.get("Australia")); //null

        // To remove value from hm
        System.out.println(hm.remove("India"));

        // If key exist or not
        System.out.println(hm.containsKey("India"));

        //Iteration on HashMap
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println("Key=" + key + " Value=" +hm.get(key));
        }

        System.out.println(hm);
        System.out.println(hm.entrySet());
    }
}
