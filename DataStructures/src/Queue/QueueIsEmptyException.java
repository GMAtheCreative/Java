package Queue;

public class QueueIsEmptyException extends RuntimeException {
    public QueueIsEmptyException() {
        super("Queue is empty");
    }
}

