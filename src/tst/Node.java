package tst;

public class Node {
	
	private int data;
	private Node right;
	private Node left;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getHigher() {
		return right;
	}
	
	public void setHigher(Node higher) {
		this.right = higher;
	}
	
	public Node getSmaller() {
		return left;
	}
	
	public void setSmaller(Node smaller) {
		this.left = smaller;
	}
}
