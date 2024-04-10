import java.util.Stack;

public class stack_using_collectionFramework {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);

		System.err.println(s.pop());
		System.out.println(s.peek());
	}

}
