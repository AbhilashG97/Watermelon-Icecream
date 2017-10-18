public class MyQueue {
    private int front, rear, capacity, size;
    private int[] arr;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        rear = capacity - 1;
        front = size = 0;
    }

    public static void main(String[] args) {
        // Do something
    }

    public boolean isEmpty(MyQueue mq) {
        return (mq.size == 0);
    }

    public boolean isFull(MyQueue mq) {
        return (mq.size == mq.capacity);
    }

    public void enqueue(int item) throws IOException {
        if (isFull(this)) {
            throw new IOException("q is full");
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    public int dequeue() throws IOException {
        if (isEmpty(this)) {
            throw new IOException("Q is full");
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int getFront() throws IOException {
        if (isEmpty(this)) {
            throw new IOException("Q is Empty.");
        }
        return arr[front];
    }

    public int getRear() throws IOException {
        if (isEmpty(this)) {
            throw new IOException("Q is empty.");
        }
        return arr[rear];
    }
}