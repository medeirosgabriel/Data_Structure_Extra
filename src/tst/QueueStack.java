package tst;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QueueStack {

	public static void main(String[] args) {
		pilhaComArray();
	}

	// PILHA COM ARRAY

	public static void pilhaComArray() {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		String[] array = new String[size];
		int p = -1;
		while (true) {
			String[] op = input.nextLine().split(" ");
			if (op[0].equals("print")) {
				printPilha(array, p);
			} else if (op[0].equals("peek")) {
				peek(array, p);
			} else if (op[0].equals("pop")) {
				p = pop(array, p);
			} else if (op[0].equals("push")) {
				p = push(array, op[1], p);
			}else {
				break;
			}
		}
	}

	private static int push(String[] array, String element, int p) {
		if (p < array.length - 1) {
			array[++p] = element;
		} else {
			System.out.println("full");
		}
		return p;
	}

	private static int pop(String[] array, int p) {
		if (p > -1) {
			array[p] = null;
			return p - 1;
		} else {
			System.out.println("empty");
			return p;
		}
	}

	private static void peek(String[] array, int p) {
		System.out.println(array[p]);
	}

	public static void printPilha(String[] array, int p) {
		if (p == -1) {
			System.out.println("empty");
		}else {
			System.out.println(Arrays.stream(array).filter(x -> x != null).collect(Collectors.joining(" ")));
		}
	}

	// FILA COM ARRAY

	public static void filaComArray() {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		String[] array = new String[size];
		int p = -1;
		while (true) {
			String[] op = input.nextLine().split(" ");
			if (op[0].equals("print")) {
				printFila(array, p);
			} else if (op[0].equals("add")) {
				 p = add(array, op[1], p);
			} else if (op[0].equals("remove")) {
				p = remove(array, p);
			} else if (op[0].equals("element")) {
				element(array, p);
			}else {
				break;
			}
		}
	}

	private static void printFila(String[] array, int p) {
		if (p == -1) {
			System.out.println("empty");
		}else {
			System.out.println(Arrays.stream(array).filter(x -> x != null).collect(Collectors.joining(" ")));
		}
		
	}

	private static int add(String[] array, String element, int p) {
		if (p < array.length - 1) {
			
		}
		return p;
	}

	private static int remove(String[] array, int p) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void element(String[] array, int p) {
		System.out.println(array[p]);
	}

	// INVERTE FRASE

	public static void inverteFrase() {
		
	}

	// INVERTE PILHA

	public static void invertePilha() {

	}

	// PARÊNTESES

	public static void parenteses() {

	}

}
