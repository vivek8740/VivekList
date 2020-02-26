package vivekList;

public class App {

	public static VivekList list;
	public static void main(String[] args) {
		list = new VivekList();
		for(int index = 1 ; index <= 5; index++)
			list.add(index);
		list.printList();
		list.addAtIndex(10, 2);
		list.printList();
		list.delete(3);
		list.printList();
			
	}
}
