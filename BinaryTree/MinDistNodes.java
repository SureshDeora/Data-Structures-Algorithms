public class MinDistNodes {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static Node lCa(Node root, int n1, int n2) {
        if(root == null) return root; // Base case
        // Self work
        if(root.data == n1 || root.data == n2) return root;
        // recursion work for left subtree
        Node leftLca = lCa(root.left, n1, n2);
        // recursion work for right subtree
        Node rightLca = lCa(root.right, n1, n2);

        // when left subtree didnot found any of the node n1, n2 then our n1, n2 exist in right subtree
        if(leftLca == null) return rightLca;
        // when right subtree didnot found any of the node n1, n2 then our n1, n2 exist in left subtree
        else if(rightLca == null) return leftLca;
        // when both subtree has found either n1, or n2 then the current node is their lca
        else return root;
    }

    private static int findDist(Node root, int n) {
        if(root == null) return -1; // when we couldn't found n in the tree
        if(root.data == n) return 0; // self distance is always 0
        int leftFind = findDist(root.left, n);// checking if the n is present in left subtree, and counting it's distence from lca(root)
        int rightFind = findDist(root.right, n); // checking if the n is present in right subtree, and counting it's distence from lca(root)
        
        if(leftFind == -1 && rightFind == -1) return -1; // when we couldn't find our n in of the subtree;
        else if(leftFind == -1) return rightFind + 1; //when the n is found in right subtree, now calculating distance by +1 for every node
        else return leftFind + 1; // when the n is found in left subtree, distance counting
    }
    public static int minDist(Node root, int n1, int n2) {
        Node lca = lCa(root, n1, n2); // first of all finding lowest common ancestor for both node n1, n2;
        int dist1 = findDist(lca, n1); // counting distance for n1
        int dist2 = findDist(lca, n2); // counting disctance for n2
        return dist1 + dist2; // final distance will be equal to both n1 and n2 's distance
    }

    public static void main(String[] w) {

        /*             1           
         *          /      \         
         *        2          3        
         *      /   \      /   \
         *     4     5    6     7     
         *    / \   / \  / \   / \
         *   8   9 10 11 12 13 14 15
         * 
         * n1 = 4 , n2 = 5 
         * Min distance of these two node = 2; 
         * n1 = 9 , n2 = 5 
         * Min distance = 3\
         * Note :- distance = number of edges between two given nodes
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
       System.out.println(minDist(root, 8,15));
    }
}
