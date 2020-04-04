package in.yadav.datastructure;

import java.util.ArrayList;

/* 
 * 1.Write a Java program to demonstrate performance of ArrayList vs Linked List against different operations like add, remove, find.
 * (Use Java Collection API's for the same)
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// Adding Elements in the list
		list.add("Ritesh");
		list.add("Rupesh");
		list.add("Sudeep");
		list.add("Raj");

		System.out.println("List of Elements Are : = " + list);

		// Removing Elements in the list
		list.remove(2);
		list.remove(1);

		System.out.println("List Of Removed Elements : = " + list);

		list.size();
		System.out.println("List Size :=  " + list);
	}
}