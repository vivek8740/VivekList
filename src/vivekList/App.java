package vivekList;

public class App {

	public static VivekList singlyList;
	public static VivekList doublyList;
	public static void main(String[] args) {
		
		singlyList = new VivekList();
		for(int index = 1 ; index <= 5; index++)
			singlyList.add(index);
		singlyList.printList();
		singlyList.addAtIndex(10, 2);
		singlyList.printList();
		singlyList.delete(3);
		singlyList.printList();
		singlyList.reverseListUsingRecursion();
		singlyList.printList();
		
		
		
		//Always print the Size of Linked singlyList.
		System.out.println(singlyList.size + 1);
		
		
		/*
		doublyList = new VivekList();
		for(int index = 1 ;index <= 5 ; index++)
			doublyList.addDoubly(index);
		
		doublyList.printDoublyList();
		
		*/	
	}
}
