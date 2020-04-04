package in.yadav.datastructure;

/* 
 *2. Write a program to delete a node from Linked List.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
public class DeletionOperationUsingLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteNode(Node node, Node n) {
		if (node == n) {
			if (node.next == null) {
				System.out.println("There is only one node. The list " + "can't be made empty ");
				return;
			}

			node.data = node.next.data;
			n = node.next;
			node.next = node.next.next;
			return;
		}
		Node prev = node;
		while (prev.next != null && prev.next != n) {
			prev = prev.next;
		}

		// Check if node really exists in Linked List
		if (prev.next == null) {
			System.out.println("Given node is not present in Linked List");
			return;
		}

		// Remove node from Linked List
		prev.next = prev.next.next;
		return;
	}

	// Display The List
	void displayList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		DeletionOperationUsingLinkedList list = new DeletionOperationUsingLinkedList();

		list.head = new Node(50);
		list.head.next = new Node(5);
		list.head.next.next = new Node(45);
		list.head.next.next.next = new Node(25);

		System.out.println("Linked List Elements Are  : = ");
		list.displayList(head);
		System.out.println("");

		System.out.println("Deleting node :" + head.next.next.data);
		list.deleteNode(head, head.next.next);

		System.out.println("Modified Linked list Elements Are  :");
		list.displayList(head);
		System.out.println("");

		// Lets delete the first node
		System.out.println("Deleting first Node");
		list.deleteNode(head, head);
		System.out.println("Modified Linked List Elements Are : = ");
		list.displayList(head);
	}
}