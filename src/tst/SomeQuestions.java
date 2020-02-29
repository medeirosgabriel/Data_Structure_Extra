package tst;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SomeQuestions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	}
	
	// INSERTIONSORT RECURSIVO
	
	public static void insertionSort(int[] array, int index) {
		if (index == array.length) {
			return;
		}else {
			int j = index - 1;
			int n = array[index];
			while (j >= 0 && n < array[j]) {
				array[j + 1] = array[j];
				j --;
			}
			array[j + 1] = n;
			System.out.println(Arrays.toString(array));
			insertionSort(array, index + 1);
		}
	}
	
	// BUSCA BINARIA
	
	public static void binarySearch2(int[] array, int element, int start, int f) {
		int middle = (start + f)/2;
		if (start > f) {
			System.out.println(-1);
			return;
		}else {
			if (array[middle] == element) {
				System.out.println(middle);
				return;
			}
			if (element > array[middle]) {
				System.out.println(middle);
				binarySearch2(array, element, middle + 1, f);
			}else {
				System.out.println(middle);
				binarySearch2(array, element, start, middle - 1);
			}
		}
	}
	
	// TABELA DE FREQUENCIA
	
	public static String tabelaDeFrequencia(int[] array) {
		int max = array[0];
		int i;
		for (i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int[] aux = new int[max + 1];
		for (i = 0; i < array.length; i++) {
			aux[array[i]] ++;
		}
		String output = "";
		for (i = 0; i < array.length; i++) {
			if (aux[array[i]] != 0) {
				output += array[i] + "," + aux[array[i]] + " ";
				aux[array[i]] = 0;
			}
		}
		return output.substring(0, output.length() - 1);
	}
	
	// POTENCIA RECURSIVA
	
		public static int potenciaRecursiva(int n, int exp) {
			if (exp == 0) {
				return 1;
			}else {
				return n * potenciaRecursiva(n, exp - 1);
			}
		}
	
	// BUSCA LINEAR RECURSIVA
	
	public static int buscaLinear(int[] array, int element, int index) {
		if (array[index] == element) {
			return index;
		}else {
			if (index == array.length - 1) {
				return - 1;
			}else {
				return buscaLinear(array, element, index + 1);
			}
		}
	}
	
	
	// 	FLOOR - LISTA DE EXERCICIO
	
	public static int floor(int[] array, int elemento, int start, int f) {
		int middle = (start + f)/2;
		if (start > f) {
			return array[f]; // PARA SER CEIL TROCA F POR START.
		}else if (array[middle] == elemento) {
			return array[middle];
		}else if (elemento < array[middle]) {
			return floor(array, elemento, start, middle - 1);
		}else {
			return floor(array, elemento, middle + 1, f);
		}
	}
	
	
	// PAR DE NUMEROS - SOMA MAIS PROXIMA DE X - LISTA DE EXERCICIO
	
	public static void parSoma(int[] array, int elemento) {
		int left = 0;
		int right = array.length - 1;
		int dif = Integer.MAX_VALUE;
		String output = "";
		while (left < right) {
			if (Math.abs(array[left] + array[right] - elemento) < dif) {
				output = left + " " + right;
				dif = Math.abs(array[left] + array[right] - elemento);
				right --;
			}else if (Math.abs(array[left] + array[right] - elemento) > dif) {
				left ++;
			}else {
				break;
			}
		}
		System.out.println(output);
	}
	
	// BUBBLESORT SIMULTANEO
	
	public static void bubbleSortSimultaneo(int[] array) {
		boolean contin = true;
		int i, temp, j;
		while (contin) {
			contin = false;
			for (i = 0; i < array.length - 1; i++) {
				j = array.length - 1 - i;
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					contin = true;
				}
				if (array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					contin = true;
				}
			}
		}
	}
	
	// SELECTIONSORT RECURSIVO
	
	public static void selectionSortRecursivo(int[] array, int start, int f) {
		if (start == f) {
			return;
		}else {
			int smaller = acharMenor(array, start, f);
			int temp = array[start];
			array[start] = array[smaller];
			array[smaller] = temp;
			System.out.println(Arrays.toString(array));
			selectionSortRecursivo(array, start + 1, f);
		}
	}
	
	public static int acharMenor(int[] array, int start, int f) {
		if (start == f) {
			return f;
		}
		int smaller = acharMenor(array, start + 1, f);
		int retorno;
		if (array[smaller] <= array[start]) {
			retorno = smaller;
		}else {
			retorno = start;
		}
		return retorno;
	}
	
	// MARIANA E OS LIVROS
	
	public static void organizaLivros(String[] array) {
		String n; 
		int j;
		System.out.println(Arrays.toString(array).substring(1, Arrays.toString(array).length() - 1));
		for (int i = 1; i < array.length; i++) {
			n = array[i];
			j = i - 1;
			while (j >= 0 && (array[j].compareTo(n) > 0)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = n;
			System.out.println(Arrays.toString(array).substring(1, Arrays.toString(array).length() - 1));
		}
	}
	
	
	// INSERE ÚLTIMO
	
	public static void insereUltimo(int[] array) {
		int i = array.length - 2;
		int n = array[array.length - 1];
		while (i >= 0 && array[i] > n) {
			array[i + 1] = array[i];
			i--;
		}
		array[i + 1] = n;
		System.out.println(Arrays.toString(array));
	}
	
	// QUICKSORT PASSO A PASSO
	
	public static void quickSort(int[] array, int start, int f) {
		if (start < f) {
			int pivotPosition = partition(array, start, f);
			quickSort(array, start, pivotPosition - 1);
			quickSort(array, pivotPosition + 1, f);
		}
	}
	
	private static int partition(int[] array, int start, int f) {
		int pivot = array[start];
		int left = start;
		int right = f;
		int temp;
		while (left <= right) {
			if (array[left] <= pivot) {
				left ++;
			}else if (array[right] > pivot) {
				right --;
			}else {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
		array[start] = array[right];
		array[right] = pivot;
		imprimirArray(array);
		return right;
	}

	// BUBBLE SORT PASSO A PASSO
	
	public static void bubbleSort(int[] array) {
		boolean contin = true;
		boolean desordenado = false;
		int i, temp, end = array.length - 1;
		while (contin) {
			contin = false;
			for (i = 0; i < end; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					contin = true;
					desordenado = true;
				}
			}
			end--;
			if (contin) {
				imprimirArray(array);
			}
		}
		if (!desordenado) {
			imprimirArray(array);
		}
	}
	
	// SELECTIONSORT PASSO A PASSO
	
	public static void selectionSort(int[] array) {
		int smaller, j, temp;
		for (int i = 0; i < array.length; i++) {
			smaller = i;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] < array[smaller]) {
					smaller = j;
				}
			}
			if (smaller != i) {
				temp = array[smaller];
				array[smaller] = array[i];
				array[i] = temp;
				System.out.println(Arrays.toString(array));
			}
		}
	}
	
	// BUSCA BINARIA
	
	public static int binarySearch(int[] array, int elemento, int start, int f) {
		int middle = (start + f)/2;
		if (start > f) {
			return -1;
		}else if (array[middle] == elemento){
			return middle;
		}else if (array[middle] > elemento){
			System.out.println(middle);
			return binarySearch(array, elemento, start, middle - 1);
		}else {
			System.out.println(middle);
			return binarySearch(array, elemento, middle + 1, f);
		}
	}
	
	// ELEMENTOS DUPLICADOS
		
	public static boolean elementosDuplicados(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++){
			if (array[i] > max) {
				max = array[i];
			}
		}
		boolean[] visited = new boolean[max + 1];
		boolean retorno = false;
		int i = 0;
		while (i < array.length && !retorno) {
			if (!visited[array[i]]) {
				visited[array[i]] = true;
				i++;
			}else {
				retorno = true;
			}
		} 
		return retorno;
	}
	
	// MERGESORT PASSO A PASSO
	
	public static void mergeSort(int[] array, int start, int f) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, start, f + 1)));
		if (start < f) {
			int middle = (start + f)/2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, f);
			merge(array, start, middle, f);
			System.out.println(Arrays.toString(Arrays.copyOfRange(array, start, f + 1)));
		}
	}

	private static void merge(int[] array, int start, int middle, int f) {
		int[] aux = new int[f + 1];
		int i = start;
		int p1 = start;
		int p2 = middle + 1;
		while (p1 <= middle && p2 <= f) {
			if (array[p1] <= array[p2]) {
				aux[i++] = array[p1++];
			}else {
				aux[i++] = array[p2++];
			}
		}
		while (p1 <= middle) {
			aux[i++] = array[p1++];
		}
		while (p2 <= f) {
			aux[i++] = array[p2++];
		}
		for (i = start; i <= f; i++) {
			array[i] = aux[i];
		}
	}
	
	// FURA FILA
	
	public static void furaFila(int[] array, int index) {
		int place = 0, j, n;
		for (int i = index; i < array.length; i++) {
			n = array[i];
			j = i - 1;
			while (j >= place) {
				array[j + 1] = array[j--];
			}
			array[place] = n;
			System.out.println(Arrays.toString(array));
			place ++;
		}
	}
	
	private static void imprimirArray(int[] array) {
		String output = "";
		for (int i = 0; i < array.length; i++) {
			output += array[i] + " ";
		}
		System.out.println(output.substring(0, output.length() - 1));
	}
}