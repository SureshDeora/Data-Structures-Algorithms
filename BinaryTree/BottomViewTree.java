import java.util.*;
public class BottomViewTree {
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
    static class Info {
        Node node;
        int hd;
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void bottomView(Node root) {
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));
        q.add(null);
        HashMap<Integer, Node> m = new HashMap<>();
        m.put(0, root);
        int min = 0, max = 0;
        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) break;
                else q.add(null);
            } else {
                m.put(curr.hd, curr.node);
                if(curr.node.left != null) {
                    q.add(new Info( curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1); 
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; i++) {
            System.out.print(m.get(i).data + " ");
        } System.out.println();

    }
    public static void main(String[] a) {

        /*              1           
         *            /   \         
         *           2     3        
         *          / \   / \
         *         4   5 6   7     4, 2, 6, 3, 7
         *  
         * */
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.right.left = new Node(4);
        root.right.left.right = new Node(14);
        root.right.right = new Node(25);
        // root.left.right.left = new Node(10);
        // root.left.right.right = new Node(14);
        bottomView(root);
    }
}
