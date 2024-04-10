public class stack_using_linkedList {

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Stack {

		static Node head; // top

		public static boolean isEmpty() {
			return (head == null); // return true and false
		}

		public static void push(int data) {
			Node newNode = new Node(data); // Node object is created

			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		public static void pop() {
			if (isEmpty()) {
				System.out.println("empty");
				return;
			}
			Node topElement = head;
			System.out.println(topElement.data);
			head = head.next;

		}

		public static void peek() {
			if (isEmpty()) {
				System.out.println("empty");
				return;
			}
			Node topElement = head;
			System.out.println(topElement.data);
		}
	}

	public static void main(String args[]) {
		Stack stack = new Stack(); // stack object is created
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.pop();
		stack.pop();

		stack.pop();

		stack.pop();

		stack.pop();

//		while (!stack.isEmpty()) {
//			stack.pop();
//
//		}
//		stack.peek();

	}

}
