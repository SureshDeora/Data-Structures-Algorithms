import java.util.Queue;
import java.util.LinkedList;
public class KthLevelTree {
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
    // Recursiv Method using preorder traversal
    public static void kthLvl(Node root, int lvl, int k) {
        if(root == null) return;

        if(lvl == k) {
            System.out.print(root.data+ " ");
            return;
        }
        
        kthLvl(root.left, lvl+1, k);
        kthLvl(root.right, lvl+1, k);
    }

    // Iterative Method using level order traversal 
    public static void kthLevel(Node root, int lvl, int k) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            if(lvl == k) { // now queue is filled with kth level data so we will print untill q gets empty
                
                    while(!q.isEmpty()) {
                        System.out.print(q.remove().data+" ");
                        if(q.peek() == null) break; // when at the end of the q is null
                    }
                     // we don't check further, simply return/break from here
                }
            Node curr = q.remove();
            if(curr == null) { // at every null we either our queue gets empty or in queue has elements of it's next level
                lvl++; // then our level increases
                if(q.isEmpty()) break;
                
                else q.add(null);
            }
            else {
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
    }
    public static void main(String[] a) {
        /*              1           1st level
         *            /   \         
         *           2     3        2nd level
         *          / \   / \
         *         4   5 6   7      3rd level and so on
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

    //    kthLvl(root, 1, 3);
       kthLevel(root, 1, 1);
    }
    
}
