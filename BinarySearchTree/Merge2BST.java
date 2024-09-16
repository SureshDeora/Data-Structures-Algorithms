import java.util.*;
public class Merge2BST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }

    }
    public static void inOrder(Node root, ArrayList<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static void listMerger(ArrayList<Integer> l1, ArrayList<Integer> l2, ArrayList<Integer> l3) {
        int i = 0 , j = 0, k = 0;
        while(i<l1.size() && j<l2.size()) {
            if(l1.get(i) <= l2.get(j)) {
                l3.add(l1.get(i));
                i++;
            } else {
                l3.add(l2.get(j));
                j++;
            }
            k++;
        }
        while(i<l1.size()) {
            l3.add(l1.get(i++));
            k++;
        } 
        while(j<l2.size()) {
            l3.add(l2.get(j++));
            k++;
        }
    }
    public static Node createBST(ArrayList<Integer> list, int si, int ei) {
        if(si>ei) return null;
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, si, mid-1);
        root.right = createBST(list, mid+1, ei);
        return root;
    }
    public static Node mergeBst(Node root1, Node root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        inOrder(root1, l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        inOrder(root2, l2);

        ArrayList<Integer> mergedList = new ArrayList<>();
         listMerger(l1, l2, mergedList);
        
        Node root = createBST(mergedList, 0, mergedList.size()-1);
        return root;

    }
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" "); 
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        /*                                          
         *                  2             9                3              
         *                /   \    +    /   \      ==    /    \
         *               1     4       3     12         1      9      
         *                                               \    / \
         *                                                2  4   12    
         *                                              
         *                              
         *                                          
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node newNode = mergeBst(root1, root2);
        preOrder(newNode);

        

    }
}
