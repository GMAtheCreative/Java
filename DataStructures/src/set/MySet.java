package set;

public class MySet<Type> {
    private Node<Type> head;
    private int size;

    public MySet() {
        this.head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        exception();
        return size;
    }

    public void add(Type data) {
        if (!contains(data)) {
            Node<Type> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public boolean contains(Type data) {
        Node<Type> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void addAll(Type[] data) {
        for (Type value : data) {
            add(value);
        }
    }

    public void remove(Type data) {
        exception();

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }
        Node<Type> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }



    }

    private void exception(){
        if (head == null) {throw new MySetException();}
    }
    private static class Node<Type> {
        Type data;
        Node<Type> next;
        public Node(Type data) {
            this.data = data;
            this.next = null;
        }
    }
}
