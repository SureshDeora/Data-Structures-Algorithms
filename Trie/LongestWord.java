public class LongestWord {
    static class Node {
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

    public static String ans = "";

    public static void longestWordAllPrefixes(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eod == true) {
                char ch = (char)(i+'a');
                temp.append(ch);
                if(ans.length() < temp.length()) {
                    ans = temp.toString();
                }
                longestWordAllPrefixes(root.children[i], temp);

                temp.deleteCharAt(temp.length()-1); //Backtracking
            }
        }
    }
    public static void main(String args[]) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        longestWordAllPrefixes(root, new StringBuilder(""));
        System.out.println(ans);
    }


}
