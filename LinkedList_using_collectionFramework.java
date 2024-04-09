import java.util.LinkedList;

public class linkedList_using_collectionFramework {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("how");
		list.addFirst("hi");
		list.addLast("you?");
		System.out.println(list);
		list.add(1, "abhi");
		System.out.print(list);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
	}

}