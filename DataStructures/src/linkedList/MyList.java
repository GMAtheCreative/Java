package linkedList;


public class MyList<Type> {
    private Node<Type> head;
    private int size;
    public MyList() {
        head = null;
        size = 0;
    }

    public int size() {

        return size;
    }

    public void add(int data) {
        Node<Type> newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node<Type> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, int data) {
        indexOutOfBoundsException(index);
        Node<Type> newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;

        }
        else {
            Node<Type> current = head;
            for (int counter = 0; counter < index; counter++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

        }
        size++;
    }

    public void addFirst(Type data) {
        Node<Type> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void remove() {
        exception();
        head = head.next;
        size--;
    }

    public void remove(int index) {
        exception();
        indexOutOfBoundsException(index);
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<Type> current = head;
            for (int counter = 0; counter < index -1; counter++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean contains(Type data) {
        exception();
        Node<Type> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Type peek() {
        exception();
        return head.data;
    }
    public Type peek(int index) {
        exception();
        indexOutOfBoundsException(index);
        if (index == 0) {
            return head.data;
        }
        else{
            Node<Type> current = head;
            for (int counter = 0; counter < index  ; counter++) {
                current = current.next;
            }
            return current.data;
        }
    }


    private void indexOutOfBoundsException(int index) {
        if (index < 0 || index > size -1) {throw new MyListException("index out of bounds");}
    }
    private void exception(){
        if(head == null) throw new MyListException();
    }

    private class Node<Type> {
        Type data;
        Node <Type> next;

        public Node(Type data) {
            this.data = data;
            this.next = null;
        }
    }
}

