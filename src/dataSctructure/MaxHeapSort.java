package dataSctructure;

import java.util.Arrays;

public class MaxHeapSort {
	
	public static void main(String[] args) {
		
		int[] array1 = {-23, -1, 0, 5, -65, 65, 232, -43, 76, 53, 70 };
		int[] array2 = {1251, 32, 2345, 1, 2, 4, 4, 4, 65, 43, 0};
		int[] array3 = {-1, -5, -32, -324, -2, -3};
		int[] array4 = {-1, -5, -32, -324, -2, -3, 1251, 32, 
						2345, 1, 2, 4, 4, 4, 65, 43, 0, 
						-23, -1, 0, 5, -65, 65, 232, -43, 76, 53, 70};
		
		heapSort(array4);
		System.out.println(Arrays.toString(array4));
	}

	private static void heapSort(int[] array) {
		int size = array.length - 1;
		for (int i = size/2; i >= 0; i--) {
			buildHeap(array, i, array.length - 1);
		}
		
		for (int i = array.length - 1; i >= 1; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			buildHeap(array, 0, i - 1);
		}
	}

	private static void buildHeap(int[] array, int i, int f) {
		int pivot = array[i];
		int j = 2 * i + 1;
		while (j <= f) {
			if (j < f) {
				if (array[j + 1] > array[j]) {
					j ++;
				}
			}
			if (pivot < array[j]) {
				array[i] = array[j];
				i = j;
				j = 2 * i + 1;
			} else {
				break;
			}
			array[i] = pivot;
		}
	}
}
