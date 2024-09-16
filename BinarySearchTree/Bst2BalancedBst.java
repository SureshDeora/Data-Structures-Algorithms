import java.util.*;
public class Bst2BalancedBst {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    private static void inOrder(Node root, ArrayList<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right,list);
    }
    private static Node balancedBST(ArrayList<Integer> list, int si,int ei) {
        if(si>ei) return null;
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = balancedBST(list, si, mid-1);
        root.right = balancedBST(list, mid+1, ei);
        return root;
    }
    public static Node convertBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
       inOrder(root, list);
       System.out.println(list);
       Node newRoot = balancedBST(list, 0, list.size()-1);
       return newRoot;
    }
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] ar) {
        /*                8                                 8
         *               / \                              /   \
         *              6   10     ==>>                  5     11
         *             /     \                          /\     /\
         *            5        11                      3  6   10 12
         *           /          \
         *          3            12
         *                      
         *               
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

       Node newRoot = convertBST(root);
        preOrder(newRoot);
        System.out.println();
        inOrder(newRoot);


    }
}
