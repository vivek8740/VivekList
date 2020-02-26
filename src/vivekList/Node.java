package vivekList;

public class Node {

	private int data;
	private Node next;
	private Node previous;
	
	//Node for creating Singly Linked List
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	
	//Node for creating Doubly Linked List
	public Node(Node previous, int data, Node next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}



	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	
	
}
