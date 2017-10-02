import java.io.IOException;

public class Deque {
	private int front, rear, size;
	private int[] arr;
	private final static int MAX = 100;

	public Deque(int size){
		front = -1;
		rear = 0;
		this.size = size;
		arr = new int[MAX];
	}

	public boolean isEmpty(){
		return(front == -1);
	}

	public boolean isFull(){
		return((front == 0 && rear == size-1) || (front == rear +1));
	}

	public void insertAtFront(int item) throws IOException{
		if(isFull()){
			throw new IOException("Deque is full");
		}
		if(front == -1){
			front = 0; 
			rear = 0;
		}else if(front == size -1){
			front = 0;
		}else{
			front--;
		}
		arr[front] = item;
	}

	public void insertAtRear(int item) throws IOException{
		if(isFull()){
			throw new IOException("Deque is full");
		}

		if(front == -1){
			front = 0;
			rear = 0;
		}else if(rear == 0){
			rear = size-1;
		}else{
			rear++;
		}
		arr[rear] = item;
	}

	public void deleteAtFront() throws IOException{
		if(isEmpty()){
			throw new IOException("Deque is empty");
		}

		if(front == rear){
			front =-1;
			rear=-1;
		}else if(front == size-1){
			front =0;
		}else{
			front++;
		}
	}

	public void deleteAtRear() throws IOException{
		if(isEmpty()){
			throw new IOException("Deque is empty");
		}

		if(front == rear){
			front = -1;
			rear=-1;
		}else if (rear == 0){
			rear = size -1;
		}else {
			rear--;
		}
	}

	public static void main(String[] args){
		//Do something
	}
}