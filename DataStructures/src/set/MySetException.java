package set;

public class MySetException extends RuntimeException {
    public MySetException() {
        super("set is empty");
    }
    public MySetException(String message) {
        super(message);
    }
}
