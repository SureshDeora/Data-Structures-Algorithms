public class IsUnivalued {
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
    public static boolean isUnivalue(Node root) {
        if(root == null) return true;
        
        if(root.left != null) {
            if(root.data != root.left.data) return false;
        }
        if(root.right != null) {
            if(root.data != root.right.data) return false;
        }
         return isUnivalue(root.left) && isUnivalue(root.right);
    
        // boolean left = isUnivalue(root.left);
        // boolean right = isUnivalue(root.right);
        // if(left && right) {
        //     return true;
        // }
        // return false;
        
        
    }
    public static void main(String[] a) {
        /*     Main Tree
         *         1
         *       /   \
         *      2      3
         *     / \    / \
         *    4   5  6   7
         * Output = No 
         * 
         *         1
         *       /   \
         *      1     1
         *     / \    / \
         *    1   1  1   1
         * Output = Yes
         */
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        // System.out.println(isUnivalue(root));
        if(isUnivalue(root)) System.out.println(" Yes ");
        else System.out.println(" No ");

    }
}
