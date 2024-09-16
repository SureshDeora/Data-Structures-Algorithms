package BinarySearchTree;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    // Delete a Node with value val 
    public static Node delete(Node root, int val) {
        // Search the val
        if(root.data > val) { // when our val is in left subtree 
            root.left = delete(root.left, val);
        } else if(root.data < val) { // when the value in right subtree
            root.right = delete(root.right, val);
        } else { // wnen we found out the val node

            // Case 1 when the deleting node is leaf node 
            if(root.left == null && root.right == null) {
                return null;
            } 

            // Case 2 when one it's child is null
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // Case 3 when we have both child without null value mean they have left subtree and right subtree
            Node IS = findInOrderSuccessor(root.right); // first find the InOrder Successor
            root.data = IS.data; // Replace the currNode(root) value with InOrder Successor 
            root.right = delete(root.right, IS.data); // then delete the IS Node from the BST
        }
        return root;
    }
    // Helper Function to Find InOrder Successor of any Node
    public static Node findInOrderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }


    // Search in a Binary Search Tree O(H) H=height of the tree
    public static boolean search(Node root, int key) { 
        if(root == null) { //when out key doesn't exist in our BST
            return false;
        }
        if(root.data == key) { // when we have found our key at node 
            return true;
        }
        if(root.data > key) { // According to Bst properties searching accordingly and raturning whatever the function returns
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) { // the first node is root 
            return root = new Node(val);
        }
        // if value is less than root, according to a property of BST assinging it left subtree of root
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else { // otherwise right subtree of the root
            root.right = insert(root.right, val);
        } 
        return root; // returning the root to traverse further
    }
    // BST Special property in InOrder traversal our output is sorted data
    public static void inOrder(Node root) {
        if(root == null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


    public static void main(String[] a) {
        int value[] = {5, 3, 1, 9, 4, 2, 7, 10, 6, 8, };
        Node root = null;
        for (int i : value) {
            root = insert(root, i);
        }

        inOrder(root);
        System.out.println();

        // if(search(root, 10)) {
        //     System.out.println("Found ");
        // } else {
        //     System.out.println(" Not Found");
        // }

        // Delete the Node 
       root =  delete(root, 10);
        System.out.println();
        inOrder(root);




    }
}
