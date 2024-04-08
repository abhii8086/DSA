public class linkedList {

	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFisrt(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;

	}

	public void printList() {
		if (head == null) {
			System.out.println("List is Empty: ");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is Empty");
		}
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("list is Empty");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node currNode = head;
		while (currNode.next.next != null) {
			currNode = currNode.next;
		}
		currNode.next = null;
	}

	public static void main(String[] args) {
		linkedList list = new linkedList();
		list.addFisrt("are");
		list.addFisrt("how");
		list.addFisrt("hi");
		list.addLast("you");
		list.addLast("abhi");
		// list.deleteFirst();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.printList();
	}

}
