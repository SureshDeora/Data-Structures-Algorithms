import java.util.*;
public class FindDupliSubTree {
    static HashMap<String, Integer> m;
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

    public static String inOrder(Node root) {
        if(root == null) {
            return "";
        }
        String str = "(";
        str += inOrder(root.left);
        str += Integer.toString(root.data);
        str += inOrder(root.right);
        str += ")";

        if(m.get(str) != null && m.get(str) == 1) {
            System.out.print(root.data + " ");
        }
        if(m.containsKey(str)) {
            m.put(str, +1);
        } else {
            m.put(str, 1);
        }
        return str;
    }

    static String preOrder(Node root) {
        if(root == null) return "$";
        String str =  preOrder(root.left)  + preOrder(root.right) + Integer.toString(root.data); 
        if(m.get(str) != null && m.get(str) == 1) {
            System.out.print(root.data+" ");
        }
        m.put(str, +1);
        return str;
    }

    public static void printAllDupli(Node root) {

        m = new HashMap<>();
        inOrder(root);
        System.out.println("my approach ");
        preOrder(root);
    }

    public static void main(String[] a) {


        /*              1           
         *            /   \         
         *           4     3        
         *          /     / \
         *         3     4   3    
         *              /
         *             3
         *         Output 4 - 3 ,  3    
         */
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.left.right = new Node(5);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);
        printAllDupli(root);
        
        

    }
}