public class CountUniqueSubString {
    /*Count Unique Substrings
     * Given a string of length n of lowercase alphabet characters, we
     * need to count total number of distinct of this string.
     * str = "ababa";  ans = 10;
     * str = "apple" ans = 15;
     */
    static class Node{
        Node children[];
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
    public static int countUniqueSubStr(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i=0; i<root.children.length; i++) {
            if(root.children[i] != null) {
                count += countUniqueSubStr(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]) {
        String str = "aba";
        for(int i=0; i<str.length(); i++) {
            String subStr = str.substring(i);
            insert(subStr);
        }
        System.out.println(countUniqueSubStr(root));
    }
    
}
