package stack;

public class Stack {
    private Node top;
    private int size;
    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (top == null) return true;
        return false;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public Object pop() {
        exception();
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public Object peek() {
        exception();
        return top.data;
    }

    public int size() {
        exception();
        return size;
    }


    private void exception(){
        if (isEmpty()) throw new StackEmptyException();
    }
    private static class Node {
        Object data;
        Node next;

        public Node() {}

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
