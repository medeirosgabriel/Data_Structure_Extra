package binarySearch;

import java.util.Arrays;

public class RecursiveCountingBinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 1, 1, 1, 67, 67, 67, 67, 67, 67, 89, 89, 90, 100, 100, 100, 101, 101, 102, 150, 150,
				150, 210, 230, 320, 320, 320, 320, 320, 320 };

		countBinarySearch(array, 100);
		System.out.println(Arrays.toString(array));
	}
	
	private static void countBinarySearch(int[] array, int w) {
		int p1 = floor(array, 0, array.length - 1, w);
		int p2 = ceil(array, 0, array.length - 1, w);
		System.out.println("Floor = " + p1);
		System.out.println("Ceil = " + p2);
		System.out.println("Quantity = " + (p2 - p1 + 1));
	}
	
	private static int floor(int[] array, int l, int r, int w) {
		int index = l;
		if (l <= r) {
			int middle = (l + r)/2;
			if (w > array[middle]) {
				index = floor(array, middle + 1, r, w);
			} else if (w <= array[middle])  {
				index = floor(array, l, middle - 1, w);
			}
		}
		return index;
	}
	
	private static int ceil(int[] array, int l, int r, int w) {
		int index = r;
		if (l <= r) {
			int middle = (l + r)/2;
			if (w >= array[middle]) {
				index = ceil(array, middle + 1, r, w);
			} else if (w < array[middle])  {
				index = ceil(array, l, middle - 1, w);
			}
		}
		return index;
	}
}
