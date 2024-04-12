package linearDataStructure;

import java.util.ArrayDeque;
import java.util.Queue;
//import java.util.LinkedList;

public class queue_using_collectionFramework {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayDeque<>();
		
//		Queue<Integer> q = new LinkedList<>();


		//enqueue
		q.add(1);
		q.add(2);
		
		//dequeue
		q.remove();

		//peek
		System.out.println(q.peek());
	}

}
