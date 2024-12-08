package HashMap;

import java.util.HashMap;

public class Find_Itinerary {
    /* Question
     * "Chennai" -> "Bengluru"
     * "Mumbai" -> "Dehli"
     * "Goa" -> "Chennai"
     * "Dehli" -> "Goa"
     * 
     * "Mumbai" -> "Dehli" -> "Goa" -> "Chennai" -> "Benagluru"
     */
    public static String getStart(HashMap<String, String> hm) {
        HashMap<String, String> revHm = new HashMap<>();

        for(String key: hm.keySet()) {
            revHm.put(hm.get(key), key);
        }
        for (String key : hm.keySet()) {
            if(!revHm.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Dehli");
        hm.put("Goa", "Chennai");
        hm.put("Dehli", "Goa");
        String strPoint = getStart(hm);
        System.out.print(strPoint);
        for (int i = 0; i < hm.size(); i++) {
            System.out.print( " -> " + hm.get(strPoint));
            strPoint  = hm.get(strPoint);
        }
        
    }
}
