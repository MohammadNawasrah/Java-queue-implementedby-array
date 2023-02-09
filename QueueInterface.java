public interface QueueInterface<T> {
    void enqueue(T number);
    void dequeue();
    int getRear();
    int getFront();
    T getQueueRear();
    T getQueueFront();
    boolean isFull();
    boolean isEmpty();
    void print();
}
