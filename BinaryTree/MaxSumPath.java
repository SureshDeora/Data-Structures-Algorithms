public class MaxSumPath {
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
    
    public static int maxSumPath(Node root) {
        if(root == null) return 0;
        int leftSum = maxSumPath(root.left); // left subtree sum
        int rightSum = maxSumPath(root.right); // right subtree sum 
        int self = leftSum + rightSum + root.data; // sum of left subtree + right subTree + it self
        int max = Math.max(self,Math.max(leftSum, rightSum)); // either left Sub Tree Sum is greater or right subtree sum or total of both including it self
        return max; // return the max one
    }
   public static void main(String[] a) {
    /* 
     *      3
     *     /  \
     *   9     20
     *        /  \
     *       15   7   
     */
    // Node root = new Node(-10);
    // root.left = new Node(9);
    // root.right = new Node(20);
    // root.right.left = new Node(15);
    // root.right.right = new Node(7);
    
    Node root = new Node(4);
    root.left = new Node(7);
    root.right = new Node(2);
    // root.right.left = new Node(15);
    // root.right.right = new Node(7);
    // System.out.println(maxSumPath(root));
    
    System.out.println(maxSumPath(root));

} 
}
