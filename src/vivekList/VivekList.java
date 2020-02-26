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

	public Node singlyHead,doublyHead;
	public Node currentNode;
	public Node previousNode;
	public Node forwardNode;
	public Node newNode;
	public int  size;
	
	//Method to Add data in List
	public void add(int value) {
		newNode = new Node(value, null);
		if(singlyHead == null)
		{
			singlyHead = newNode;
			size++;
			//System.out.println("Item Added...");
		}
		else
		{
			currentNode = singlyHead;
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
			currentNode = singlyHead;
			singlyHead = newNode;
			singlyHead.setNext(currentNode);
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
			currentNode = singlyHead;
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
		currentNode = singlyHead;
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
		currentNode = singlyHead;
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
		currentNode = singlyHead;
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
			singlyHead = node;
			return node;
		}
		
		localNode = recursive(node.getNext());
		localNode.setNext(node);
		return node;
	}
	
	//Method to Add data in DoublyList
	public void addDoubly(int value) {
		newNode = new Node(null,value, null);
		if(doublyHead == null)
		{
			doublyHead = newNode;
			size++;
			//System.out.println("Item Added...");
		}
		else
		{
			currentNode = doublyHead;
			while(currentNode.getNext() != null)
			{
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			newNode.setPrevious(currentNode);
			currentNode.setNext(newNode);
			size++;
			//System.out.println("Item Added...");
		}
		
	}
	
	//Method to print Doublylist.
	public void printDoublyList() {
		currentNode = doublyHead;
		System.out.println("Current List is: ");
		while(currentNode.getNext() != null )
		{
			if(currentNode.getPrevious() == null)
				System.out.println("Null<-"+currentNode.getData()+"->"+currentNode.getNext().getData());
			else
				System.out.println(currentNode.getPrevious().getData()+"<-"+currentNode.getData()+"->"+currentNode.getNext().getData());
			currentNode = currentNode.getNext();
		}
		System.out.print(currentNode.getPrevious().getData()+"<-"+currentNode.getData()+"->Null");
		System.out.println();
	}
}
