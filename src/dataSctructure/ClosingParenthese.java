package dataSctructure;

import java.util.Stack;

public class ClosingParenthese {
	
	public static void main(String args[]) {
		String text = "{([])}";
		String text1 = "{(){()}{}{}()(){{}()}}";
		String text2 = "{(){()}{{}[{}()]}(){[{}()]}}{}([][{}{}()][])[{}]";
		Stack stack = new Stack<Character>();
		verification(text2, stack);
	}
	
	private static void verification(String text, Stack<Character> stack) {
		int i = 0, length = text.length();
		boolean failed = false;
		while (i < length && !failed) {
			char c = text.charAt(i);
			if (isParenthese(c)) {
				if (typeVerification(c)) {
					stack.push(c);
				} else {
					if (!stack.isEmpty()) {
						char head = stack.pop();
						char corr = getCorrespondent(head);
						if (c != corr) {
							failed = true;
						}
					}
				}
			}
			i++;
		}
		if (failed || !stack.isEmpty()) {
			System.out.println("I'm sorry! This is Wrong!");
		} else {
			System.out.println("Congratulations! This is right!");
		}
	}
	
	private static char getCorrespondent(char c) {
		char r;
		switch (c) {
			case '{':
				r = '}';
				break;
			case '(':
				r = ')';
				break;
			default:
				r = ']';
				break;
		}
		return r;
	}
	
	private static boolean typeVerification(char c) {
		return c == '{' || c == '(' || c == '[';
	}
	
	private static boolean isParenthese(char c) {
		return c == '{' || c == '(' || c == '[' ||
				c == '}' || c == ')' || c == ']';
	}
}
