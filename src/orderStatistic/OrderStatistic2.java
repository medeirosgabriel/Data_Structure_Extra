package orderStatistic;

import java.util.Arrays;

public class OrderStatistic2 {
	public static void main(String[] args) {
		int[] array = {1, 5, 65, 65, 232, 43, 76, 53, 70};
		System.out.println(getOrderStatistics(array, 3));
	}
	
	public static int getOrderStatistics(int[] array, int k) {
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		return statistics(array, 3, min, max);
	}

	private static int statistics(int[] array, int k, int min, int max) {
		if (k == 0) {
			return min;
		}else {
			int aux = max;
			for (int i = 0; i < array.length; i++) {
				if (array[i] < aux && array[i] > min) {
					aux = array[i];
				}
			}
			return statistics(array, k - 1, aux, max);
		}
	}
}
