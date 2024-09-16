public class InvertBinaryTree {
    static class Node {
        int data ;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }
    public static Node inverTree(Node root) {
        if(root == null) return root;
        // calling subtree to invert
        Node left = inverTree(root.left);
        Node right = inverTree(root.right);
        // now swapping current node's child
        root.left = right;
        root.right = left;
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) {
            return;

        }
        inOrder(root.left);
        System.out.print(root.data+ ", ");
        inOrder(root.right);
    }

    public static void main(String[] a){

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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inOrder(root);
        System.out.println();
        inverTree(root);
        System.out.println();
        inOrder(root);
    }
}
