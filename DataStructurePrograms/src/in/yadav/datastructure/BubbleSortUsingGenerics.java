package in.yadav.datastructure;

/* 
 *3. Write a program for Bubble sort using the integer sort generics.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  04-04-2020
 * */
class BubbleSort {
	public static <T extends Comparable<T>> void bubbleSort(T[] list, int size) {
		int swapOccurred = 1, outCounter, inCounter;
		T temp;
		for (outCounter = size - 1; outCounter > 0 && swapOccurred == 1; outCounter--) {
			swapOccurred = 0;
			for (inCounter = 0; inCounter < outCounter; inCounter++) {
				if (list[inCounter].compareTo(list[inCounter + 1]) > 0) {
					temp = list[inCounter];
					list[inCounter] = list[inCounter + 1];
					list[inCounter + 1] = temp;
					swapOccurred = 1;
				}
			}
		}
	}
}

public class BubbleSortUsingGenerics {
	public static void main(String[] args) {
		Integer arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		BubbleSort.bubbleSort(arr, arr.length);

		System.out.println("Sorted Array: ");
		for (Integer elements : arr) {
			System.out.println("Sorted Elements Are : = " + elements);
		}
	}
}