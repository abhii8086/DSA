import java.util.ArrayList;

public class stack_using_arrayList {

	static class stack {

		static ArrayList<Integer> list = new ArrayList<Integer>();

		static boolean isEmpty() {
			return (list.size() == 0);
		}

		// push
		static void push(int data) {
//			if (isEmpty()) {
//				list.add(data);
//				return;
//			}
			list.add(data);
		}

		// pop
		static void pop() {
			if (isEmpty()) {
				System.out.println("Empty:");
				return;
			}
			int top = list.get(list.size() - 1);
			System.out.println(top);
			list.remove(list.size() - 1);

		}

		// peek
		static void peek() {
			if (isEmpty()) {
				System.out.println("Empty:");
				return;
			}
			int top = list.get(list.size() - 1);
			System.out.println(top);
		}

	}

	public static void main(String[] args) {
		stack s = new stack();
		s.push(1);
		s.push(2);

//		s.pop();
//		s.pop();
//		s.pop();

		s.peek();

	}

}
