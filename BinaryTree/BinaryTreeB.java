import java.util.*;
public class BinaryTreeB {
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
     static class BinaryTree {
        static int idx = -1;
        // Building tree in Pre Order
     public static Node binaryTree(int[] nodes) {
        idx++;
        // When a node is leaf or ends
        if(nodes[idx] == -1) {
            return null;
        }
        
        Node newNode = new Node(nodes[idx]);
        newNode.left = binaryTree(nodes);
        newNode.right = binaryTree(nodes);
        return newNode;
     }
     // PreOrder Treversal
     /* Root
      * left subtree
      * right subtree
      */
     public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);

     }
     // InOrder Traversal
     /* left subtree
      * Root
      * right subtree
      */
      public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

      }
    // Post Order Traversal
    /* Left subtree
     * Right subTree
     * Root
     */
    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // Level Order Traversal 
    /* if tree   1
     *         /   \            
     *        2     3           
     *       / \      \
     *      4   5      6
     * Output Should be :- 1
     *                     2 3
     *                     4 5 6 
     */

     public static void levelOrder(Node root) {
        if(root == null) return; // when our Bt is empty
        Queue<Node> q = new LinkedList<>(); 
        q.add(root); // adding 1st root node 
        q.add(null); // for newline adding null
        while(!q.isEmpty()) { // we will traverse our q 
            // first node will get removed if this node is null then print newline
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                // while removed element from the q, if q gets empty then simply break
                if(q.isEmpty()) break;
                else q.add(null); // otherwise add null back to the queue
            } // if removed node has any data, print it and check it's left and right child node 
            else { 
                System.out.print(curr.data+" "); 
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
     }

     // Height of a Binary Tree 
     public static int height(Node root) {
        if(root == null) return 0; // when our bt is empty

        // First left subtree height count till it's depth
        // then right subtree height count till it's depth
        int lh = height(root.left);
        int rh = height(root.right);
        // The max depth of a subtree +1(for root node) is our height of tree
        return Math.max(lh, rh) +1; // +1 for including it self
     }



     // Count Nodes of a Binary Tree
     public static int countNodes(Node root) {
        if(root == null) return 0; // if there isn't any node in our tree

        //Left subtree nodes count
        int leftCount = countNodes(root.left);
        // right subtree nodes count
        int rightCount = countNodes(root.right);

        // total nodes = left subtree nodes count + right subtree nodes count + 1 (it self root node)
        return leftCount + rightCount + 1;
     } 

     // Sum of nodes
     public static int sum(Node root) {
        if(root == null) return 0;

        // left subtree sum 
        int leftSum = sum(root.left);
        // right subtree sum
        int rightSum = sum(root.right);

        // totat = left subtree sum + right subtree sum + itselft
        return leftSum + rightSum + root.data;
     }



     // Diameter of a tree O(n^2)
     public static int diameter(Node root) {
        if(root == null) return 0;
        //left child diameter
        int leftDiam = diameter(root.left);
        //right child diameter
        int rightDiam = diameter(root.right);
        // left height 
        int lh = height(root.left);
        // right height
        int rh = height(root.right);

        // diameter when root itself included in 
        int self = lh + rh + 1;
        // Max length of diameter left diameter or right diameter or self
        return Math.max(self, Math.max(leftDiam, rightDiam));
     }

     // Diameter with optimum solution O(n)
     // Here we count height of tree along with the rest process
     
     static class Info {
        int height;
        int diameter;
        public Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
     }
     public static Info diam(Node root) {
        if(root == null) return new Info(0, 0);
        Info leftInfo = diam(root.left);
        Info rightInfo = diam(root.right);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;
        int diame = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), (leftInfo.height + rightInfo.height +1));
        return new Info(ht, diame);
     }

    }
    public static void main(String[] a) {
        int[] nodes = {1, 2, 4, 9, -1, -1, -1, 5, 6, 7, -1, -1, -1, -1,  3, -1, -1};
        BinaryTree bt = new BinaryTree();
       Node root = bt.binaryTree(nodes);
        // System.out.println(root.data);
        // bt.preOrder(root);
        // System.out.println();
        // bt.inOrder(root);
        // System.out.println();
        // bt.postOrder(root); 
        // System.out.println();
        bt.levelOrder(root);
        // System.out.println(bt.height(root));
        System.out.println("Count Nodes  ");
        System.out.println(bt.countNodes(root));
        System.out.println("Sum of All the Nodes ");
        System.out.println(bt.sum(root));
        System.out.println("Diameter of Tree ");
        System.out.println(bt.diameter(root));
        System.out.println(" Diameter Opt ");
        System.out.println(bt.diam(root).diameter);


    }
}
