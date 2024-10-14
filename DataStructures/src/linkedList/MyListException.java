package linkedList;

public class MyListException extends RuntimeException {
    public MyListException() {
        super("List is empty");
    }
    public MyListException(String message) {
        super(message);
    }
}
