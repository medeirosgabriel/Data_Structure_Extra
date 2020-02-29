package tst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	public static void main(String[] args) {
		int[] array = {10, 7, 5, 9, 20, 18, 21, -1};
		Node n = binarySearchTree(array);
		bfs(n);
	}
	
	public static void bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.println(n.getData());
			if (n.getSmaller() != null) {
				q.offer(n.getSmaller());
			}
			if (n.getHigher() != null){
				q.offer(n.getHigher());
			}
		}
	}
	
	public static Node binarySearchTree(int[] array) {
		Node root = null;
		for (int i = 0; i < array.length; i++) {
			if (root != null) {
				insert(root, array[i]);
			}else {
				root = new Node(array[i]);
			}
		}
		return root;
	}
	
	public static void insert(Node n, int valor) {
		if (valor <= n.getData()) {
			if (n.getSmaller() != null) {
				insert(n.getSmaller(), valor);
			}else {
				n.setSmaller(new Node(valor));
			}
		}else {
			if (n.getHigher() != null) {
				insert(n.getHigher(), valor);
			}else {
				n.setHigher(new Node(valor));
			}
		}
	}
}
