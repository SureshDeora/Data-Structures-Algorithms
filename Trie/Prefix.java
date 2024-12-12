/*Prefix Problem
 * Find shortest unique prefix for every word in a given list.
 * Assume no word is prefix of another.
 * arr[] = {"zebra", "dog", "duck", "dove"};
 * ans = {"z", "dog", "du", "dov"};
 */
public class Prefix {
    static class Node {
        Node children[];
        boolean eod;
        int frq;
        public Node() {
            children = new Node[26];
            eod = false;
            frq = 1;
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
            } else {
                curr.children[idx].frq++;
            }
            curr = curr.children[idx];
        }
        curr.eod = true;
    }
    // Implemented by myself
    public static String getUniquePrefix(String word) {
        String str = "";
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            str += word.charAt(i);
            if(curr.children[idx] != null && curr.children[idx].frq==1) {
                return str;
            }
            curr = curr.children[idx];
        }
        return str;
    }

    //solution from tutorial
    public static void findPrefix(Node root, String ans) {
        if(root == null ) {
             return;
        }

        if(root.frq == 1) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String args[]) {
        String words[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        for(int i=0; i<words.length; i++) {
            System.out.println(getUniquePrefix(words[i]));
        }

        System.out.println();


        root.frq = 0;
        findPrefix(root, "");
    }
}
