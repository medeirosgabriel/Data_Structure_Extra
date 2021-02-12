package orderStatistic;

import java.util.Arrays;

public class OrderStatisticSelection {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 65, 65, 232, 43, 76, 53, 70};
		getOrderStatistics(array, 4);
	}
	
	public static void getOrderStatistics(int[] array, int k) {
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		int n = statistic(array, k, min, max);
		System.out.println(k + " statistic order is " + n);
	}
	
	private static int statistic(int[] array, int k, int min, int max) {
		if (k - 1 == 0) {
			return min;
		} else {
			int aux = max;
			for (int i = 0; i < array.length; i++) {
				if (array[i] < aux && array[i] > min) {
					aux = array[i];
				}
			}
			return statistic(array, k - 1, aux, max);
		}
	}

	
}