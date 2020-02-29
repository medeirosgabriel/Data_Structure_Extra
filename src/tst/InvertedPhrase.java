package tst;

import java.util.Scanner;

public class InvertedPhrase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase = input.nextLine();
		String palavra = "";
		Pilha p = new Pilha();
		for (int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) != ' ') {
				palavra += frase.charAt(i);
			}else {
				p.push(palavra);
				palavra = "";
			}
		}
		p.push(palavra);
		palavra = "";
		while (p.getTail() != -1) {
			palavra += p.pop() + " ";
		}
		System.out.println(palavra.substring(0, palavra.length() - 1));
	}
}

class Pilha {
	
	private String[] array;
	private int tail;
	
	Pilha(){
		array = new String[100];
		tail = -1;
	}
	
	public void push(String palavra) {
		array[++tail] = palavra;
	}
	
	public String pop() {
		return array[tail--];
	}
	
	public int getTail() {
		return tail;
	}
}
