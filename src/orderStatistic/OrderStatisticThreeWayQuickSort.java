package orderStatistic;

import java.util.Arrays;

public class OrderStatisticThreeWayQuickSort {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 65, 65, 232, 43, 76, 53, 70};
		statisticThreeWayQuickSort(array, 5, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void statisticThreeWayQuickSort(int[] array, int k, int left, int right) {
		if (left < right) {
			int pivot = array[left];
			int p1 = left, p2 = left + 1, p3 = right;
			while (p2 <= p3) {
				if (array[p2] < pivot) {
					int temp = array[p1];
					array[p1] = array[p2];
					array[p2] = temp;
					p1 ++; p2 ++;
				} else if (array[p2] > pivot) {
					int temp = array[p3];
					array[p3] = array[p2];
					array[p2] = temp;
					p3 --;
				} else {
					p2 ++;
				}
			}
			if (k - 1 >= p1 && k - 1 <= p3) {
				System.out.println(k + " statistic order is " + pivot);
			} else {
				statisticThreeWayQuickSort(array, k, left, p1 - 1);
				statisticThreeWayQuickSort(array, k, p2, right);
			}
		} else {
			if (k - 1 == left) {
				System.out.println(k + " statistic order is " + array[left]);
			}
		}
	}
}
