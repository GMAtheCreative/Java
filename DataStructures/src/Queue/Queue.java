package Queue;

public class Queue {
    private Node front;
    private Node rear;
    private int size;
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        boolean frontIsEmpty = front == null;
        if(frontIsEmpty) return true;
        return false;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Object deQueue() {
        exception();
        Object data = front.data;
        front = front.next;
        if(isEmpty()) rear = null;
        size--;
        return data;
    }

    public Object peek() {
        exception();
        return front.data;
    }


    private void exception(){
        boolean isNotvalid = this.front == null && this.rear == null;
        if(isNotvalid) throw new QueueIsEmptyException();
    }

    private class Node {
        Object data;
        Node next;

        public Node() {}

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
    
}
