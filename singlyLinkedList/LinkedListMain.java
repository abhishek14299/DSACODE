/**
 * 
 */
package singlyLinkedList;

/**
 * 
 */
public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListImpl linkedList=new SinglyLinkedListImpl();
		linkedList.insertLinkedList(12, 2);
		linkedList.insertLinkedList(14, 0);
		linkedList.insertLinkedList(15, 1);
		linkedList.insertLinkedList(126, 4);
		linkedList.traverseLinkedList();
		System.out.println("\n");
		linkedList.deleteLinkedList(0);
		linkedList.traverseLinkedList();
		System.out.println("\n");
		linkedList.deleteLinkedList(4);
		linkedList.traverseLinkedList();
		System.out.println("\n");
		linkedList.deleteLinkedList(1);
		linkedList.traverseLinkedList();
	}

}
