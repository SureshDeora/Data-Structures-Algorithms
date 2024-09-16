import java.util.*;
public class RangeSumBst {
    /*
     * Given the root node of a binary search tree 
     * and two integers low and high, return the sum of values of all nodes 
     * with a value in the inclusive range [low, high].
     * 
     * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
     * Output: 32
     * Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
     */

     static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // static int sum = 0;
    public static int rangeSum(Node root, int low, int high) {
        if(root == null) return 0;
         int sum = 0;
        if(root.data >= low && root.data <= high) {
            sum = rangeSum(root.left, low, high) + rangeSum(root.right, low, high) + root.data;
            // int left = rangeSum(root.left, low, high);
            // int right = rangeSum(root.right, low, high);
            //  sum = left+right+root.data;
            return sum;
           
        }
        if(root.data > low) {
            return rangeSum(root.left, low, high);
        } 
        if(root.data < high) {
             return rangeSum(root.right, low, high);
        }
        return sum;
        
    }

    // Solution from pdf
    static int sum = 0;
    public static int rangeSumBST(Node root, int low, int high) {
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr.data>=low && curr.data<=high) {
                sum += curr.data;
            } 
            if(curr.left!=null && curr.data>low) q.add(curr.left);
            if(curr.right != null && curr.data < high) q.add(curr.right);
        }
        return sum;
    }
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] arr) {
        /*              8           
         *            /   \         
         *           5     10        
         *          / \     \
         *         3   6     11    
         *        / \          \
         *       1   4          14
         * Output 5, 6, 8, 10, 11
         *         
         * */
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
            
        }
        preOrder(root);
        System.out.println();
       System.out.println(rangeSum(root, 4, 11));
       System.out.println();
       System.out.println(rangeSumBST(root, 4, 11));

    }
}
