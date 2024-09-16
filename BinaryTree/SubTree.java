public class SubTree {
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
        // Subtree of a tree
        public static boolean isIdentical(Node root, Node subRoot) {
            // if Both tree ends at same time, it means the subtree exist in main tree after 
            // checking for whole structure and nodes as equals to each other
            if(root == null && subRoot == null) return true;

            // When our one of the subtree ends or their data doesn't match 
            // it means our subtree is not equal to main tree's subtree
            else if(root == null || subRoot == null || root.data != subRoot.data)  return false;
            
            // checking in left subtree of main tree if doesn't match
            else if(!isIdentical(root.left, subRoot.left))  return false;
            
            // checking in right subtree of main tree, if doesn't match 
            else if(!isIdentical(root.right, subRoot.right)) return false;
            
            // else we will return true where any of the above conding doesn't get exicuted
             return true;
        }
        public static boolean isSubtree(Node root, Node subRoot) {
            // When the subtree doesn't exist in main tree
            if(root == null) return false;

            // checking if the subTree starting from itself root
            if(root.data == subRoot.data) {
                if(isIdentical(root, subRoot)) {//This function will check if the whole subtree
                    return true;            // exist same as in main subtree by checking structure
                }                           // and nodes
            }
            // or Either exist in left subtree of main tree
            boolean left = isSubtree(root.left, subRoot);
            // and in right subtree of main tree
            boolean right = isSubtree(root.right, subRoot);
            // if our subtree exist of these above left 
            // and right subtree of main tree then return true;
            return left || right;
        }
    
    public static void main(String[] a) {
        /*     Main Tree
         *         1
         *       /   \
         *      2      3
         *     / \    / \
         *    4   5  6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        /*   Sub Tree   
         *       
         *      2     
         *     / \   
         *    4   5 
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // subRoot.left.left = new Node(6);

        System.out.println(isSubtree(root, subRoot));


    }
}
