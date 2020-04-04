package in.yadav.datastructure;
/* 
 *7. Convert singly linked list into circular linked list.
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */

class ConvertSinglyToCircularlinkedList {
	static class Node {
		int data;
		Node next;
	};

	static Node circular(Node head) {
		Node start = head;
		while (head.next != null)
			head = head.next;

		head.next = start;
		return start;
	}

	static Node push(Node head, int data) {
		Node newNode = new Node();

		newNode.data = data;
		newNode.next = (head);
		(head) = newNode;

		return head;
	}

	// Display List Method
	static void displayList(Node node) {
		Node start = node;

		while (node.next != start) {
			System.out.print(" " + node.data);
			node = node.next;
		}
		System.out.print(" " + node.data);
	}

	public static void main(String args[]) {
		Node head = null;

		head = push(head, 55);
		head = push(head, 41);
		head = push(head, 31);
		head = push(head, 88);
		head = push(head, 71);

		circular(head);

		System.out.print("Display list: \n");
		displayList(head);
	}
}
