/**
 * 
 */
package singlyLinkedList;

/**
 * 
 */
public class SinglyLinkedListImpl {

	Node head;
	Node tail;
	int size;
	
	public Node createLinkedList(int nodeValue) {
		Node newNode=new Node();
		head=new Node();
		newNode.next=null;
		newNode.val=nodeValue;
		head=newNode;
		tail=newNode;
		size=1;
		return head;
	}
	
	//insert mathod
	public void insertLinkedList(int nodeValue,int location) {
		Node node=new Node();
		node.val=nodeValue;
		if(head==null) {
			createLinkedList(nodeValue);
			return;
		}
		if(location==0) {
			node.next=head;
			head=node;
		}
		else if(location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else{
			int index=0;
			Node currentNode=head;
			while(index!=location-1) {
				currentNode=currentNode.next;
			}
			node.next=currentNode.next;
			currentNode.next=node;
		}
		size++;
	}
	
	public int size() {
		return this.size;
	}
	
	//Traverse Method
	public void traverseLinkedList() {
		if(head==null) {
			System.out.println("Your LinkedList is empty");
		}
		
		else {
			Node tempNode =head;
			int index=0;
			while(tempNode!=null) {
				System.out.print(tempNode.val+" ");
				if(index<size-1) {
					System.out.print(" -> ");
					index++;
				}
				tempNode=tempNode.next;
			}
		}
		
	}
	
	//search node
	public boolean searchLinkedList(int nodeValue) {
		if(head!=null) {
			Node tempNode=head;
			while(tempNode!=null) {
				if(nodeValue==tempNode.val) {
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		return false;
	}
	
	//Delete node
	public void deleteLinkedList(int location) {
		if(head==null) {
			System.out.println("LinkedList does not exist");
			return;
		}
		if(location==0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
		}
		else if(location>=size) {
			Node tempNode =head;
			int index=0;
			while(index<size-2) {
				tempNode=tempNode.next;
				index++;
			}
			if(tempNode==head) {
				head=tail=null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}
		else {
			Node tempNode =head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}		
			tempNode.next=tempNode.next.next;
			
			size--;
		}
		
	}
}


