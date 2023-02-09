public  class Queue<T> implements QueueInterface<T> {

    private int rear;
    private int front;
    private T queueArray[];
    private int sizeQueueArray;
    private int count = 0;

    public void setRear(int rear) {
        this.rear = rear;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public Queue(int sizeQueueArray) {
        this.setRear(-1);
        this.setFront(-1);
        this.sizeQueueArray = sizeQueueArray;
        this.queueArray = (T[]) new Object[this.sizeQueueArray];
    }

    @Override
    public void enqueue(T number) {
        if (!isFull())
            if (this.rear == -1 && this.front == -1) {

                this.rear = (this.rear + 1) % this.sizeQueueArray;
                this.front = (this.front + 1) % this.sizeQueueArray;
                this.queueArray[this.rear] = number;
                System.out.println("Done add item to queue");
                this.count++;
            } else {

                this.rear = (this.rear + 1) % this.sizeQueueArray;
                this.queueArray[this.rear] = number;
                System.out.println("Done add item to queue");
                this.count++;
            }
        else
            System.out.println("This queue is full you can't add to queue");
    }

    @Override
    public void dequeue() {
        if (!isEmpty()) {


            this.front = (this.front + 1) % this.sizeQueueArray;
            System.out.println("Done remove item from queue");
            this.count--;

        } else {
            System.out.println("Your queue is empty you can't remove element");
        }
    }

    @Override
    public int getRear() {
        return this.rear;
    }

    @Override
    public int getFront() {
        return this.front;
    }

    @Override
    public T getQueueRear() {
        return this.queueArray[this.rear];
    }

    @Override
    public T getQueueFront() {
        if (!isEmpty()) {
            return this.queueArray[this.front];
        } else {
            return this.queueArray[this.front];
        }
    }

    @Override
    public boolean isFull() {
        if (this.count == this.sizeQueueArray)
            return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.count == 0)
            return true;
        return false;
    }

    @Override
    public void print() {
        if (!isEmpty()) {
            System.out.println("");
            System.out.print("Your Queue is :[ ");


            for (int i = this.front; i != this.rear; i = (i + 1) % this.sizeQueueArray) {

//                System.out.println("i= "+i);5

                System.out.print(this.queueArray[i]);
                if (this.rear != i)
                    System.out.print(" , ");
            }
            System.out.print(this.queueArray[this.rear]);
            System.out.print(" ]");
            System.out.println("");

        } else {
            System.out.println("Your queue is empty");
        }
    }
}
