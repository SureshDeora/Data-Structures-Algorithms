public class ClosestElement {
    /*
    Given a BST and an integer. 
    Find the least absolute difference between any node value of the BST and the given integer.
            * Input:
             10
            /   \
           2    11
         /  \ 
        1    5
            /  \
           3    6
            \
             4
        K = 13
        Output: 
        11
        Explanation: K=13. The node that has
        value nearest to K is 11. so the answer
        is 11
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

    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Finding the closest elment from the Binary Search Tree
    static int diff = Integer.MAX_VALUE;
    public static Node closestElement(Node root, int key) {
        if(root == null) return root;

        if(key == root.data) {
            diff = 0;
            return root;
        }
        else if(key < root.data) {
            Node closestLeft = closestElement(root.left, key);
            int currDiff = Math.abs(key - root.data);
            if(diff > currDiff){
                diff = currDiff;
                return root;
            }
            return closestLeft;
        } else {
            Node closestRight = closestElement(root.right, key);
            int currDiff = Math.abs(key - root.data);
            if(diff > currDiff){
                diff = currDiff;
                return root;
            }
            return closestRight;
        }
        // return root;


    }
    public static void main(String[] args) {

         /*             8           
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
        System.out.println(closestElement(root, 8).data);
    }
}
