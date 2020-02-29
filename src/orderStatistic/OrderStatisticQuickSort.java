package orderStatistic;

import java.util.Arrays;

public class OrderStatisticQuickSort {
	public static void main(String[] args) {
		int[] array = {1, 5, 65, 65, 232, 43, 76, 53, 70};
		statisticQuickSort(array, 2, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void statisticQuickSort(int[] array, int k, int left, int right) {
		if (left < right) {
			int pivotPosition = partition(array, left, right);
			if (pivotPosition == k - 1) {
				System.out.println(array[pivotPosition]);
			}
			statisticQuickSort(array, k, left, pivotPosition - 1);
			statisticQuickSort(array, k, pivotPosition + 1, right);
		}
	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[left], p1 = left, p2 = right;
		while (p1 <= p2) {
			if (array[p1] <= pivot) {
				p1++;
			}else if (array[p2] > pivot) {
				p2--;
			}else{
				int temp = array[p1];
				array[p1] = array[p2];
				array[p2] = temp;
			}
		}
		array[left] = array[p2];
		array[p2] = pivot;
		return p2;
	}
}
