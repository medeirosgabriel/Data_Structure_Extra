package tst;

import java.util.Scanner;

public class QueueArray {

	private static int i = -1;

	private static int j = -1;
	
	private static int quant = 0;
	
	private static int size = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		input.nextLine();
		String[] array = new String[size];
		while (true) {
			String[] op = input.nextLine().split(" ");
			if (op[0].equals("print")) {
				printFila(array);
			} else if (op[0].equals("add")) {
				add(array, op[1]);
			} else if (op[0].equals("remove")) {
				remove(array);
			} else if (op[0].equals("element")) {
				element(array);
			} else {
				break;
			}
		}
	}

	private static void element(String[] array) {
		if (quant > 0) {
			System.out.println(array[i]);
		}
	}

	private static void remove(String[] array) {
		if (quant > 0) {
			array[i] = null;
			i = (i + 1) % array.length;
			quant --;
		}else {
			System.out.println("empty");
		}
	}

	private static void add(String[] array, String string) {
		if (quant < size) {
			j = (j + 1) % array.length;
			array[j] = string;
			i = (i == -1) ? 0 : i;
			quant++;
		}else {
			System.out.println("full");
		}
	}

	private static void printFila(String[] array) {
		if (quant > 0) {
			int cont = quant;
			String output = "";
			int index = i;
			while (cont != 0) {
				output += array[index] + " ";
				index = (index + 1) % array.length;
				cont --;
			}
			System.out.println(output.substring(0, output.length() - 1));
		}else {
			System.out.println("empty");
		}
	}
}
