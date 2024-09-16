public class ValidateBST {
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
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean validBST(Node root, Node min, Node max) {
        if(root == null) return true;

        //According to 1st and 2nd Property of the Valid BST , the tree have all the node between the 
        // the range of min and max (exclusive)
        if(min != null && root.data<= min.data) return false;
          else if(max != null && root.data >= max.data) return false;

          // the min (InOrder Precessor) is the  left most node in right subtree, 
          //and max(InOrder Subcessor) is the  right most node of the left subtree
          
          return validBST(root.left, null, root) && validBST(root.right, root, null);
    }
    public static void main(String[] a) {
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
        inOrder(root);
        if(validBST(root, null, null)) {
            System.out.println("Valid BST ");
        } else {
            System.out.println("InValid BST ");
        }
    }
}
