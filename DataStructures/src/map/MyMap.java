package map;

public class MyMap<KeyType, ValueType> {
    private Node<KeyType, ValueType>[] table;
    private int tableInitialSize = 2;
    private int size;
    public MyMap() {
        table = new Node[tableInitialSize];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(KeyType key, ValueType value) {
        size++;
    }

    public int size() {
        return size;
    }


    private class Node<KeyType, ValueType> {
        KeyType key;
        ValueType value;
        Node(KeyType key, ValueType value) {
            this.key = key;
            this.value = value;
        }
    }
}
