public class AVLBST {
    static class Node {
        int data, height;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }
    static Node root;
    // Height Function
    public static int height(Node root) {
        if(root == null) return 0;
        return root.height;
    }
    // Balance Factor Function
    public static int getBalanceFactor(Node root) {
        if(root == null) return 0;
        return height(root.left) - height(root.right);
    }
    // Left Rotation
    public static Node leftRotation(Node x) {
        // preserving nodes which are tend to lost while rotation;
        Node y = x.right;
        Node T2 = y.left;
        // Now Rotating
        y.left = x;
        x.right = T2;
        // updating heights
        x.height = Math.max(height(x.left), height(x.right)) +1;
        y.height = Math.max(height(y.left), height(y.right)) +1;
        // return New Root which is Y Now
        return y;
    }
    // Right Rotation 
    public static Node rightRotation(Node y) {
        // preserving nodes which are tend to lost while rotation;
        Node x = y.left;
        Node T2  = x.right;
        // Ratation
        x.right = y;
        y.left = T2;
        // updating heights
        y.height = Math.max(height(y.left), height(y.right)) +1;
        x.height = Math.max(height(x.left), height(x.right)) +1;
        //return new Node which become X now
        return x;
    }
    
    // Creating Avl Tree
    public static Node insert(Node root, int key) {
        if(root == null) {
            return new Node(key);
        }
        if(key < root.data) {
            root.left = insert(root.left, key);
        }
        else if(key > root.data) {
            root.right = insert(root.right, key);
        }
        else return root; // duplicates not allowed

        // Updating root's height
        root.height = Math.max(height(root.left), height(root.right)) +1;

        // Balance Factor
        int bf = getBalanceFactor(root);

        // 4 Cases LL, RR, LR, RL
        //Left Left Case
        if(bf > 1 && key < root.left.data) {
            return rightRotation(root);
        }
        // Right Right Case
        if(bf < -1 && key > root.right.data) {
            return leftRotation(root);
        }
        // Left Right Case
        if(bf > 1 && key > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root); 
        }
        // Right Left Case
        if(bf < -1 && key < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        // if the Avl is already balanced 
        return root;
    }
    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] ar) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*              AVL Tree
         * 
         *                      30
         *                    /    \
         *                  20      40
         *                 /  \       \  
         *                10  25      50
         * 
         * if inserted without Avl
         *    10
         *      \
         *      20
         *     /  \
         *   25    30
         *          \
         *           40
         *            \
         *             50
         */
        preOrder(root);
    }
}
