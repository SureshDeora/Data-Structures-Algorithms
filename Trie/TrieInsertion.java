package Trie;

public class TrieInsertion {
    static class Node {
        Node children[];
        boolean isEndofWord;
        Node() {
            children = new Node[26];
            isEndofWord = false;
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
        }
    }
        public static Node root = new Node();
        // O(l) length of biggest word 
        public static void insert(String word) {
            Node curr = root;
            for(int level=0; level<word.length(); level++) {
                int idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.isEndofWord = true;
        }

        // O(l) length of biggest word 
        public static boolean search(String key) {
            Node curr = root;
            for(int level=0; level<key.length(); level++) {
                int idx = key.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.isEndofWord;
        }
    
    public static void main(String args[]) {
        String arr[] = {"air", "aim", "app"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        String key = "aim";
        System.out.println(search(key));
    }
}
