public class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;

        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) return new Node(val);
        if(root.data > val)
        root.left = insert(root.left, val);

        else root.right = insert(root.right, val);
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // Mirror a BST
    public static Node mirrorBst(Node root) {
        if(root == null) return null;
        //first mirror left and right subtree 
        Node mirrorLeft = mirrorBst(root.left);
        Node mirrorRight = mirrorBst(root.right);

        // Now Self work 
        root.left = mirrorRight;
        root.right = mirrorLeft;
        return root;
    }
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void  main(String[] a) {
         /*     Main Tree
         *         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7      
         * 
         *  4 <--> 5        1                  6 <--> 7     1           Now when 2 <--> 3      1
         *                /   \                           /   \         the whole subtree    /   \ 
         *               2     3                         2     3       of both will inter   3     2
         *              / \   / \                       / \   / \      change              / \   / \
         *             5   4 6   7                     5   4 7   6                        7   6 4   5 
         * 
         * Invert of above tree
         *         1
         *       /   \
         *      3     2
         *     / \   / \
         *    7   6 5   4
         * 
         */
        int values[] = {1, 4, 2, 3, 6, 7, 5};
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
            
        }
        inOrder(root);
        mirrorBst(root); System.out.println();
        preOrder(root);
    }
}
