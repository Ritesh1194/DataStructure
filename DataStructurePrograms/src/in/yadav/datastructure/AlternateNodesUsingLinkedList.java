package in.yadav.datastructure;
/* 
 *5. Print alternate nodes of a linked list using recursion
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */

class AlternateNodesUsingLinkedList {

	static class Node {
		int data;
		Node next;
	};

	// printAlternateNode Method
	static void printAlternateNode(Node head) {
		int count = 0;

		while (head != null) {
			if (count % 2 == 0)
				System.out.printf(" %d ", head.data);
			count++;
			head = head.next;
		}
	}

	// Function to push node at head
	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = (head_ref);
		(head_ref) = new_node;
		return head_ref;
	}

	public static void main(String args[]) {
		Node head = null;
		head = push(head, 22);
		head = push(head, 49);
		head = push(head, 33);
		head = push(head, 43);
		head = push(head, 88);

		printAlternateNode(head);
	}
}