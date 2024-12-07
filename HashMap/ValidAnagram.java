import java.util.HashMap;

public class ValidAnagram {
    /*
     * Question
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase,
     * typically using all the original letters exactly once.
     * 
     * s="race" t="care" True
     * s="heart" t="earth" True
     * s="tulip" t="lipid" False
     */


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // first we put the first string to hashmap with the each character count 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //then iterating the second string while matching character with stored in hash map of the first string,
        // reducing character count for every match and if any character didn't match means it's not a valid anagram returning false
        // in the end if the hash map gets empty means both of the strings are anagram to each other.
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String args[]) {
        String s = "tulip";
        String t = "lipid";
        System.out.println(isAnagram(s, t));
    }
}