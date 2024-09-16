public class LargestBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int largeBST = 0;
    static Node largeNode = null;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        // left and right subtrees Informations
        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        // self work and 4 Parameters to check
        // size of the tree;
        // Min of the tree
        // Max of the tree
        // IsBST conditions
        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        // Checking if a BST is Valid or not
        if (root.data <= left.max || root.data >= right.min) {
            return new Info(false, size, min, max);
        } else if (left.isBST && right.isBST) {
            // largeBST = Math.max(largeBST, size);
            if (largeBST < size) { // this codition if we want to print
                largeNode = root; // the largest BST as well by saving root that largest BST
                largeBST = size;
            }
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;

        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] ar) {
        /*
         * 50
         * / \
         * 30 60
         * / \ / \
         * 5 20 45 70
         * / \
         * 65 80
         * 
         * 
         * 
         * Largest BST of Size = 5 from root as 60;
         * 
         * 
         * 
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        largestBST(root);
        System.out.println(largeBST);
        inOrder(largeNode);

    }

}
