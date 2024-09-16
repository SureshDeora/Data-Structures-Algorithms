public class KthSmallest {
    /*
     * Given the root of a binary search tree, 
     * and an integer k, return the kth smallest value (1-indexed) of all the values
     *  of the nodes in the tree.
     * 
     * Input: root = [3,1,4,null,2], k = 1
     * Output: 1
     * 
     * Input: root = [5,3,6,2,4,null,null,1], k = 3
     * Output: 3
      
     */
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
    public static Node insert(Node root, int key) {
        if(root == null) {
            return new Node(key);
        }
        if(root.data > key) {
            root.left = insert(root.left, key);
        }
        else if(root.data < key) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static int count = 0;
    static Node kth = null;
    public static void kthSmallestEle(Node root, int k) {
        if(root == null) return;
        kthSmallestEle(root.left, k);
        count++;
        if(count == k) {
            count = root.data;
            kth = root;
        } 
        kthSmallestEle(root.right, k);
        return ;
    }
    // Solution from the pdf
    public static Node kthSmallest(Node root, int k) {
        if(root == null) return null;
        Node left = kthSmallest(root.left,k);
        if(left != null) return left;
        count++;
        if(count == k) return root;
        return kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        /*
         *              8           
         *            /   \         
         *           5     10        
         *          / \     \
         *         3   6     11    
         *        / \          \
         *       1   4          14
         * 
         *         
         * 
         */
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
        }
        inOrder(root);
        kthSmallestEle(root, 1);
        System.out.println();
        if(kth != null) System.out.println(kth.data);
        System.out.println();
        if(kthSmallest(root, count)!=null)System.out.println(kthSmallest(root, 10).data);
    }
}
