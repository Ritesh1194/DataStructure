package in.yadav.datastructure;

/* 
 *4. Reverse a Doubly linked list using recursion.
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
class ReverseUsingDoublyLinkedList {
	static class Node {
		int data;
		Node next, prev;
	};

	static Node getNode(int data) {

		Node new_node = new Node();
		new_node.data = data;
		new_node.next = new_node.prev = null;
		return new_node;
	}

	// Insert a node at the beginning of the Doubly Linked List
	static Node push(Node head_ref, Node new_node) {
		new_node.prev = null;
		new_node.next = (head_ref);
		if ((head_ref) != null)
			(head_ref).prev = new_node;

		(head_ref) = new_node;
		return head_ref;
	}

	// function to reverse a doubly linked list
	static Node ReverseLinkedList(Node node) {
		if (node == null)
			return null;

		Node temp = node.next;
		node.next = node.prev;
		node.prev = temp;

		if (node.prev == null)
			return node;
		return ReverseLinkedList(node.prev);
	}

	// Display The List
	static void displayList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String args[]) {
		Node head = null;
		head = push(head, getNode(10));
		head = push(head, getNode(20));
		head = push(head, getNode(30));
		head = push(head, getNode(40));
		System.out.print("Linked  list: ");
		displayList(head);

		// Reverse doubly linked list
		head = ReverseLinkedList(head);
		System.out.print("\nReversed list: ");
		displayList(head);
	}
}