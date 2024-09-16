package RandRivision;
import java.util.*;

public class Rivision {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
    
        // public boolean isEmpty() {
        //     return q1.isEmpty() && q2.isEmpty();
        // }

        // // Push efficient
        // public void push(int data) {
        //     if(!q1.isEmpty()) {
        //         q1.add(data);
        //     } else {
        //         q2.add(data);
        //     }
        // }

        // public int peek() {
        //     int top = Integer.MIN_VALUE;
        //     if(!q1.isEmpty()) {
        //         while(!q1.isEmpty()) {
        //             top = q1.peek();
        //             q2.add(q1.peek());
        //             q1.remove();
        //         }
        //     } else {
        //         while(!q2.isEmpty()) {
        //             top = q2.peek();
        //             q1.add(q2.peek());
        //             q2.remove();
        //         }
        //     }
        //     return top;
        // }

        // public int pop() {
        //     int top = Integer.MIN_VALUE;
        //     if(!q1.isEmpty()) {
        //         while(!q1.isEmpty()) {
        //             top = q1.remove();
        //             if(q1.isEmpty()) {
        //                 break;
        //             }
        //             q2.add(top);
        //         }
        //     } else {
        //         while(!q2.isEmpty()) {
        //             top = q2.remove();
        //             if(q2.isEmpty()) {
        //                 break;
        //             }
        //             q1.add(top);
        //         }
        //     }
        //     return top;
        // }
    



    // Pop efficient
    public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

    public void push(int data) {
        if(q1.isEmpty()) {
            q1.add(data);
            while(!q2.isEmpty()) {
                int top = q2.remove();
                q1.add(top);
            }
        } else {
            q2.add(data);
            while(!q1.isEmpty()) {
                int top = q1.remove();
                q2.add(top);
            }
        }
    }
    public int peek() {
        if(!q1.isEmpty()) {
            return q1.peek();
        } else {
            return q2.peek();
        }
    }

    public int pop() {
        if(!q1.isEmpty()) {
            return q1.remove();
        } else {
            return q2.remove();
        }
    }


    }


    public static void main(String args[]) {
       
       Stack st = new Stack();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println(st.peek());
       System.out.println(st.pop());
    //    System.out.println(st.q2.isEmpty());
       System.out.println();
       while(!st.isEmpty()) {
           System.out.println(st.peek());
           st.pop();
        }
    //     System.out.println();
    //    System.out.println(st.q2.isEmpty());

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    /* 
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    

    System.out.println();

    for(int i=5; i>=1; i--) {
        for(int j=i; j>=1; j--) {
            System.out.print(i);
        }
        System.out.println();
    }

    System.out.println();
    // int count=1;
    for(int i=1; i<=5; i++) {
        for(int j=1; j<=5-i+1; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print(i+" ");
            //count++;
        }
        System.out.println();
    }

    System.out.println();
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5-i+1; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++) {
                System.out.print(i);
            }
            for(int j=3; j<=i*2-1; j++)
            System.out.print(" ");

            for(int j=2; j<=2; j++) {
                if(i==1) {
                    continue;
                }
                System.out.print(i);
            }
            System.out.println();
        }


*/   






    }
    
}
