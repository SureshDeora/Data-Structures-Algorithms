public class KthAncestor {
    
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
    
        // it is very similar to Lowest Common Ancestor Problem
        public static int kAncestor(Node root, int n, int k) {
            if(root == null) return -1; // when n is not found 
            if(root.data == n) return 0; // the node which is equals to n, so it's distance from it's own is 0
            int leftDist = kAncestor(root.left, n, k); //   leftDist for n 
            int rightDist = kAncestor(root.right, n, k); // rightDist for n
            if(leftDist == -1 && rightDist == -1) return -1; // when our n is not available either in left or right
            int max = Math.max(leftDist, rightDist); // here any one of either left or right is -1 and second has a valid distance, max always  save valid dist, it is same case as if left or  right one of them equals to -1 return second one
            if(max+1 == k) System.out.println(root.data); // so if the node is equals to k , means the distance is equal to k , it is kth ancestor for n node, print it
            return max+1; // otherwise return the distance 
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
             * n = 4 , k = 2
             * kth Ancestor for n = 2; 
             * n = 9 , k = 1
             * kth Ancestor for n = 4
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
           kAncestor(root, 11, 3);
           
        }
    }
    
    

