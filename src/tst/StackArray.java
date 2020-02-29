package tst;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StackArray {
	
	private static int size = 0;
	
	private static int p = -1;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		size = input.nextInt(); input.nextLine();
		String[] array = new String[size];
		while (true) {
			String[] op = input.nextLine().split(" ");
			if (op[0].equals("print")) {
				printPilha(array);
			} else if (op[0].equals("peek")) {
				peek(array);
			} else if (op[0].equals("pop")) {
				pop(array);
			} else if (op[0].equals("push")) {
				push(array, op[1]);
			}else {
				break;
			}
		}
	}
	
	private static void push(String[] array, String element) {
		if (p < array.length - 1) {
			array[++p] = element;
		} else {
			System.out.println("full");
		}
	}

	private static void pop(String[] array) {
		if (p > -1) {
			array[p] = null;
			p --;
		} else {
			System.out.println("empty");
		}
	}

	private static void peek(String[] array) {
		System.out.println(array[p]);
	}

	public static void printPilha(String[] array) {
		if (p == -1) {
			System.out.println("empty");
		}else {
			System.out.println(Arrays.stream(array).filter(x -> x != null).collect(Collectors.joining(" ")));
		}
	}
}
