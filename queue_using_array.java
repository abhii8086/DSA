package linearDataStructure;

public class queue_using_Array {

	int array[] = new int[5];
	int size = array.length;
	int front = -1;
	int rear = -1;

	public boolean isEmpty() {
		return (rear == -1 && front == -1);
	}

	public boolean isFull() {
		return (rear == size - 1);
	}

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("the queue is full: ");
			return;
		}
		array[++rear] = data;
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		}
		front++;
		int temp = array[front];
		System.out.println("the remove element is: " + temp);

	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		}
		front++;
		int temp = array[front];
		System.out.println("the front element is: " + temp);

	}

	public static void main(String[] args) {
		queue_using_Array q = new queue_using_Array();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);

		q.deQueue();
		q.deQueue();
		q.deQueue();

		q.peek();

	}

}
