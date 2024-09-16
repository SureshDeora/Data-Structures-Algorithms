import java.util.*;
public class PrintRoot2Leaf {
    static class Node {
        int data ;
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
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> al) {
        if(root == null) return;
        al.add(root.data); // we will add every node to our auxilary ArrayList 
        if(root.left == null && root.right == null) { // when we tackle leaf Node so we gonna print it 
            printR2L(al); // Utility function to print root 2 leaf
            return;
        }
        printRoot2Leaf(root.left, al); // left subtree 
        printRoot2Leaf(root.right, al); // right subtree
        al.remove(al.size()-1); // while backtracking remove that element last added element so it don't get repeated 
    }
    private static void printR2L(ArrayList<Integer> al) {
        for (int i=0; i<al.size(); i++) {
            System.out.print(al.get(i)+"->");
        } System.out.println("Null");
    }
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
        }
        // inOrder(root);

        
        printRoot2Leaf(root, new ArrayList<>());
}
}
