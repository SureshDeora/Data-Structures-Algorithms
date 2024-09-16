import java.util.*;
public class PrintInRange {
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
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) return;
        
        if(root.data >= k1 && root.data <= k2) { // when the element is between the range then our element exist in the 
            printInRange(root.left, k1, k2);     // left and right subtree both , so print it in InOrder to get result in sorted order
            System.out.print(root.data+ " ");
            printInRange(root.right, k1, k2);
        }
         else if(root.data > k1) { // when root is greater than range then the range elements exist in left
            printInRange(root.left, k1, k2);
         } else { // otherwise in right
            printInRange(root.right, k1, k2);
         }
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
        // inOrder(root);
        int k1 = 9; int k2 = 12;
        printInRange(root, k1, k2);
        
    }
}
