package in.yadav.datastructure;

import java.util.LinkedList;

/* 
 * 1.Write a Java program to demonstrate performance of ArrayList vs Linked List against different operations like add, remove, find.
 * (Use Java Collection API's for the same)
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// Adding Elements in the list
		list.add("Raja");
		list.add("Ravi");
		list.add("Durga");
		list.add("Prem");

		System.out.println("List of Elements Are : = " + list);

		// Removing Elements in the list
		list.remove(2);
		list.remove(1);

		System.out.println("List Of Removed Elements : = " + list);

	}
}