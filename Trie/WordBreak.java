package Trie;

/*Word Break Problem
 * Given an input string and a dictonary of words, find out if the input string can be broken into a
 * space-separated sequence of dictionary words.
 * words[] = { i, like, sam, samsung, mobile, ice};
 * key = ilikesamsung
 * output = true;
  */
public class WordBreak {
    static class Node {
        Node children[];
        boolean endOfWord;
        public Node() {
            children = new Node[26];
            endOfWord =  false;
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String key) {
        Node curr = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }

    // O(L) length of the string
    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            if(search(key.substring(0, i)) &&
             wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        String words[] = {"i", "like", "sam", "samsung", "moblie", "ice"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        // System.out.println(search("ice"));
        String key = "ilikesamsung";
        boolean output = wordBreak(key);
        System.out.println(output);
    }
    
}
