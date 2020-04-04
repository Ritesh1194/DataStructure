package in.yadav.datastructure;

/* 
 *6. Remove duplicates from a sorted linked list using recursion
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
class RemoveDuplicateusingLinkedList {
	static class Node {
		int data;
		Node next;
	};

	static Node removeDuplicates(Node head) {

		if (head == null)
			return null;
		head.next = removeDuplicates(head.next);

		if (head.next != null && head.next.data == head.data) {
			Node res = head.next;
			return res;
		}
		return head;
	}

	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = (head_ref);
		(head_ref) = new_node;
		return head_ref;
	}

	// displayList Method
	static void displayList(Node node) {
		while (node != null) {
			System.out.printf("%d ", node.data);
			node = node.next;
		}
	}

	public static void main(String args[]) {

		Node head1 = null;
		head1 = push(head1, 60);
		head1 = push(head1, 33);
		head1 = push(head1, 33);
		head1 = push(head1, 100);
		head1 = push(head1, 100);
		head1 = push(head1, 50);

		System.out.printf("\n Linked list before duplicate removal : = ");
		displayList(head1);

		Node head2 = removeDuplicates(head1);

		System.out.printf("\n Linked list after duplicate removal : = ");
		displayList(head2);
	}
}
