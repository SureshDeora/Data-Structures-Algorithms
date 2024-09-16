public class TransformSum {
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
    // formula To Calculate Sum for Current Node = left child actual data  + right child actual data + Sum of current node's left child + sum of current node right child
    public static int transform(Node root) {
        if(root == null) {
            return 0;
        }
        int leftChild = transform(root.left); // left child actual value to achieve it's own sum
        int rightChild = transform(root.right); // right child actual value to achieve it's own sum
        int data = root.data; // to preserve our currunt node actual value before it's getting replaced with sum
        int newLeft = root.left == null ? 0 : root.left.data; // special cases for leaf nodes 
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = leftChild + newLeft + rightChild + newRight; // now we are transforming our current node's value with sum
        return data;
    }
    public static void main(String[] a) {
            /*   // formula To Calculate Sum for Current Node = left child actual data  + right child actual data + Sum of current node's left child + sum of current node right child
             *             1                                27        Node 1 = 9 + 13 + 2 + 3 = 27
             *          /      \                          /    \
             *        2          3        ===>          9       13     Node 2 = 0 + 0 + 4 + 5 = 9,  Node 3 = 0 + 0 + 6 + 7 = 13
             *      /   \      /   \                   /          \
             *     4     5    6     7                 0            0   Node 4 = 0 + 0 + 0 + 0 = 0 and same for rest leaf Nodes
             
             * 
             *
             * 
             * 
             */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7); 
            root.left.left.left = new Node(8);
            root.left.left.right = new Node(9);
            root.left.right.left = new Node(10);
            root.left.right.right = new Node(11);
            root.right.left.left = new Node(12);
            root.right.left.right =new Node(13);
            root.right.right.left = new Node(14);
            root.right.right.right = new Node(15);
    }
}
