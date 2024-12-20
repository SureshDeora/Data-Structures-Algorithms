public class StartWith {
    /*Start with problem
     * Create a function boolean startsWith(String prefix) for a trie.
     * Returns true if there is a prebiously inserted string word that has the 
     * prefix and false otherwise.
     * words[] = { "apple", "app", "mango", "man", "woman"};
     * prefix = app   output : true;
     * prefix = moon output : false
     * 
     */

     static class Node {
        Node children[] ;
        boolean eod;
        public Node() {
            children = new Node[26];
            eod = false;
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
        }
     }

     public static Node root = new Node();

     public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eod = true;
     }
     public static boolean startWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
     }
     public static void main(String args[]) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        String prefix = "man";
        System.out.println(startWith(prefix));
     }
}
