package dataSctructure;

import java.util.Arrays;

public class InPlaceMergeSort {
	
	public static void main(String[] args) {
		
		int[] array1 = {-23, -1, 0, 5, -65, 65, 232, -43, 76, 53, 70 };
		int[] array2 = {1251, 32, 2345, 1, 2, 4, 4, 4, 65, 43, 0};
		int[] array3 = {-1, -5, -32, -324, -2, -3};
		int[] array4 = {-1, -5, -32, -324, -2, -3, 1251, 32, 
						2345, 1, 2, 4, 4, 4, 65, 43, 0, 
						-23, -1, 0, 5, -65, 65, 232, -43, 76, 53, 70};
		
		inPlaceMS(array1, 0, array1.length - 1);
		System.out.println(Arrays.toString(array1));
	}
	
	private static void inPlaceMS(int[] array, int start, int end) {
		if (start < end) {
			int middle = (start + end)/2;
			inPlaceMS(array, start, middle);
			inPlaceMS(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}

	private static void merge(int[] array, int start, int middle, int end) {
		int p1 = start;
		int p2 = middle + 1;
		while (p1 <= middle && p2 <= end) {
			if (array[p1] <= array[p2]) {
				p1 ++;
			} else {
				int index = p2;
				int value = array[p2];
				while (index > p1) {
					array[index] = array[index - 1];
					index --;
				}
				array[p1] = value;
				p1++; middle++; p2++;
			}
		}
	}
}
