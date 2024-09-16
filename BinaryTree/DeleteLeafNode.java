public class DeleteLeafNode {
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
    // My approach 
    public static Node deleteNode(Node root, int x) {
        if(root == null) return root;
        // if(root.data == x) {
        //     if(root.left == null && root.right == null) {
        //         root = null;
        //         return;
        //     }
        // }
        
        
       Node left = deleteNode(root.left, x);
       Node right = deleteNode(root.right, x);
       if(left != null) {
        if(left.data == x) {
            if(left.left == null && left.right == null) {
                root.left = null;
            }
        } }
        if(right != null) {
            if(right.data == x) {
                if(right.left == null && right.right == null) {
                    root.right = null;
                }
            }
        }
        return root;
    }
    // From Solution Pdf
    public static Node deleteXLeaf(Node root, int x) {
        if(root == null) return null; // Base Case
        root.left = deleteXLeaf(root.left, x); // if currNode left node is leafnode with value X then it will point to null to delete that node, 
        root.right = deleteXLeaf(root.right, x); // if currNode right node is leaf node with value X then remove that node by pointing null
        if(root.data == x && root.left == null && root.right == null) {
            return null; //here it will check if the currNode is the node with value X and leaf node , then to exclude own self return null to it's root/parent node
        }
        return root; // otherwise return same node as it is;
    }
    public static void preOrder(Node root) {
        if(root == null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] a) {
        /*              1           
         *            /   \         
         *           2     3        
         *          / \   / \
         *         4   5 6   7     
         *   X = 5 
         *  Output 
         *              1           
         *            /   \         
         *           2     3        
         *          /     / \
         *         4     6   7   
         */
       Node root = new Node(1);
       root.left = new Node(3);
       root.right = new Node(3);
       root.left.left = new Node(3);
       root.left.right = new Node(2);
       root.right.left = new Node(6);
       root.right.right = new Node(7); 
       preOrder(root);
       deleteNode(root, 3);
       System.out.println();
       preOrder(root);
    // System.out.println();
    }
}
