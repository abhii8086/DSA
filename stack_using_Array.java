public class stack_using_Array {

	int[] Array = new int[5];
	int size = Array.length;
	int top = -1;

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size);
	}

//	push
	public void push(int data) {
		if (isEmpty()) {
			top++;
			Array[top] = data;

		} else if (isFull()) {
			System.out.println("stack  is full my dear:");
		} else {
			top++;
			Array[top] = data;

		}
	}

//	pop
	public void pop() {
		if (isEmpty()) {
			System.out.println("bhaiiya khali hai stack");
		}
		int element = Array[top];
		System.out.println(element);
		top--;
	}

// peek
	public void peek() {
		if (isEmpty()) {
			System.out.println("bhaiiya khali hai stack");
			return;
		}
		int element = Array[top];
		System.out.println(element);
	}

	public static void main(String[] args) {
		stack_using_Array s = new stack_using_Array();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		s.pop();
		s.pop();
//		s.pop();

		s.peek();

	}

}
