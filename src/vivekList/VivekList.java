/*********************************************************************
 * public void add(int value)										 *
 * public void printList() 											 *
 * public void addAtFirst(int value)								 *
 * public void addAtIndex(int value,int index)						 *
 * public void delete(int value)									 *
 * public void reverseListUsingRecursion()							 *
 ********************************************************************/
package vivekList;

public class VivekList {

	public Node head;
	public Node currentNode;
	public Node previousNode;
	public Node forwardNode;
	public Node newNode;
	public int  size;
	
	//Method to Add data in List
	public void add(int value) {
		newNode = new Node(value, null);
		if(head == null)
		{
			head = newNode;
			size++;
			//System.out.println("Item Added...");
		}
		else
		{
			currentNode = head;
			while(currentNode.getNext() != null)
				currentNode = currentNode.getNext();
			currentNode.setNext(newNode);
			size++;
			//System.out.println("Item Added...");
		}
		
	}
	
	//Method to add Data at First.
	public void addAtFirst(int value) {
			newNode = new Node(value, null);
			currentNode = head;
			head = newNode;
			head.setNext(currentNode);
			size++;
			//System.out.println("Item Added At First....");
		
	}
	
	//Method to add data at given Index.
	public void addAtIndex(int value,int index) {
		if(index <= 0 && index > size)
		{
			System.out.println("Provide valid index:");
		}
		else
		{
			int localIndex = 1;
			newNode = new Node(value, null);
			currentNode = head;
			while(localIndex != index)
			{
				currentNode = currentNode.getNext();
				localIndex++;
			}
			
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
			System.out.println("Item "+value+" Added at "+localIndex);
		}
		
	}
	
	//Method to delete any data.
	public void delete(int value) {
		currentNode = head;
		boolean flag = false;
		while(currentNode.getData()!= value)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(currentNode.getNext());
		size--;
		System.out.println("Item "+value+" is Deleted");
		
	}
	
	//Method to print list
	public void printList() {
		currentNode = head;
		System.out.println("Current List is: ");
		while(currentNode.getNext() != null )
		{
			System.out.print(currentNode.getData()+"->");
			currentNode = currentNode.getNext();
		}
		System.out.print(currentNode.getData());
		System.out.println();
	}
	
	//Method to reverse List Using Recursion
	public void reverseListUsingRecursion() {
		currentNode = head;
		if(currentNode.getNext() == null)
			return;
		else
		{
			 currentNode = recursive(currentNode);
			 currentNode.setNext(null);
			 System.out.println("List is Reversed. ");
		}
		
	}
	
	//Recursive Function to add the reversed list as next to current node and return that current node.
	public Node recursive(Node node)
	{
		Node localNode = null;
		if(node.getNext() == null)
		{
			head = node;
			return node;
		}
		
		localNode = recursive(node.getNext());
		localNode.setNext(node);
		return node;
	}
}
