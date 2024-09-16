import java.util.ArrayList;

public class LowestCommonAncestor {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private static boolean findPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) return false; // so far we could not found the n 
        path.add(root); // we will add every node , if it exist in the path of n,
        //  then keep it otherwise we will delete at the end
        //self work
        if(root.data == n) return true; // when we found our n in the path

        // checking in left subtree
        boolean leftFind = findPath(root.left, n, path);
        // checking in right subtree
        boolean rightFind = findPath(root.right, n, path);

        // if any of the subtree has found the n, 
        if(leftFind || rightFind) {
            return true;
        }
        // otherwise remove that earliar added node because it doesn't exist in the path of n
        path.remove(path.size()-1); // and return as false
        return false;
    }
    public static Node lowestCommonAncestor(Node root, int n1, int n2) {
        // to save found path for both n1 and n2 
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        findPath(root, n1, path1); // n1 path checking 
        findPath(root, n2, path2); // n2 path checking

        int i=0; // our both path 1 and 2 has almost same node, so whenever different node occurs, we will break
        for(; i<path1.size() && i<path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // the for loop we broke at distinct node , then the previous of the iterated i is the ans or lca
        return path1.get(i-1);
    }


    // Approach 2 for Better Space complexity
    public static Node lCa(Node root, int n1, int n2) {
        if(root == null) return root; // Base case
        // Self work
        if(root.data == n1 || root.data == n2) return root;
        // recursion work for left subtree
        Node leftLca = lCa(root.left, n1, n2);
        // recursion work for right subtree
        Node rightLca = lCa(root.right, n1, n2);

        // when left subtree didnot found any of the node n1, n2 then our n1, n2 exist in right subtree
        if(leftLca == null) return rightLca;
        // when right subtree didnot found any of the node n1, n2 then our n1, n2 exist in left subtree
        else if(rightLca == null) return leftLca;
        // when both subtree has found either n1, or n2 then the current node is their lca
        else return root;
    }
    public static void main(String[] s) {
         /*             1           
         *          /      \         
         *        2          3        
         *      /   \      /   \
         *     4     5    6     7     
         *    / \   / \  / \   / \
         *   8   9 10 11 12 13 14 15
         * 
         * n1 = 4 , n2 = 5 
         * The common lowest ancestor of these two nodes is 2
         * n1 = 9 , n2 = 5 lca = 2
         */
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7); 
       root.left.left.left = new Node(8);
       root.left.left.right = new Node(9);
       root.left.right.left = new Node(10);
       root.left.right.right = new Node(11);
       root.right.left.left = new Node(12);
       root.right.left.right =new Node(13);
       root.right.right.left = new Node(14);
       root.right.right.right = new Node(15);

       Node ans1 = lowestCommonAncestor(root, 8, 15);
       Node ans2 = lCa(root, 8, 11);
       System.out.println(ans1.data + "  "+ ans2.data);

    }
}