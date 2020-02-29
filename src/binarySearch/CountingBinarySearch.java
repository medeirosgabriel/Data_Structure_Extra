package binarySearch;

public class CountingBinarySearch {
	
	public static void main(String[] args) {
		int[] array = new int[] {-1, -1, 1, 4, 5, 6, 7, 7, 7, 8, 8, 9, 10, 10};
		System.out.println(count(array, 7));
	}
	
	public static int count(int[] array, int elem) {
		int right = ceil(array, elem, 0, array.length - 1);
		System.out.println("CEIL: " + right);
		int left = floor(array, elem, 0, array.length - 1);
		System.out.println("FLOOR: " + left);
		if (left == -1 || right == -1) {
			return 0;
		}
		return right - left + 1;
	}

	private static int ceil(int[] array, int elem, int leftIndex, int rightIndex){
		int left = leftIndex, right = rightIndex;
		while (left <= right) { 
			int middle = (left + right)/2;
			if (array[middle] == elem) {
				left = middle + 1;
			}else if (elem < array[middle]) {
				right = middle - 1;
			}else {
				left = middle + 1;
			}
		}
		return right;
	}
	
	private static int floor(int[] array, int elem, int leftIndex, int rightIndex){
		int left = leftIndex, right = rightIndex;
		while (left <= right) { 
			int middle = (left + right)/2;
			if (array[middle] == elem) {
				right = middle - 1;
			}else if (elem < array[middle]) {
				right = middle - 1;
			}else {
				left = middle + 1;
			}
		}
		return left;
	}
}
