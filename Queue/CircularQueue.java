package Queue;

public class CircularQueue {
    static class Queue{
        int arr[];
        int size;
        int front;
        int rear;
        Queue(int n) {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }
        // isEmpty
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }
        // if  out circular queue is full
        public boolean isFull() {
            return front == (rear+1)%size;
        }
        // add
        public void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full ");
                return;
            }
            if(front == -1) { //if it is the first element which we are adding
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        //remove
        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            } 
            int result = arr[front];

            if(front == rear) //if it is the only element to be removed
                front = rear = -1;
             else
                front = (front+1)%size;
                
                return result;
        }
        // peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
      
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();

        }

    }
    
}
