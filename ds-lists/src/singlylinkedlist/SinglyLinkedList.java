package singlylinkedlist;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	
	
	public int size;
	
	//deleting a node from  SLL
	public void deletionOfNode(int location) {
		if (head == null) {
			System.out.println("The SLL does not exist");
			return;
		}else if (location == 0) {
			head = head.next;
			size--;
			if ( size == 0) {
				tail = null;
			}
		}else if ( location >= size) {
			Node tempNode = head;
			for( int i  = 0 ; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if ( tempNode == head) {
				tail = head = null;
				size --;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
		}else {
			Node tempNode = head;
			for (int i = 0; i < location -1 ; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	public void deleteSLL() {
		head = null;
		tail = null;
		System.out.println("the sll deleted successfully");
	}
	
	boolean searchNode(int nodeValue) {
		if ( head != null) {
			Node  tempNode = head;
			for ( int i = 0 ; i < size ; i++) {
				if ( tempNode.value == nodeValue) {
					System.out.print("Found the node at location: " + i+ "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("node not found");
		return false;
	}
	
	public void traverseSinglyLinkedList() {
		if ( head == null ) {
			System.out.println("SLL does not exist");
		}else {
			Node tempNode = head;
			for  ( int i = 0 ; i < size;i++) {
				System.out.print(tempNode.value);
				if (i != size -1) {
					System.out.print(" -> ");
				}
				tempNode  = tempNode.next;
			}
		}
		System.out.println("\n");
	}
	
	
	public void insertInLinkedList(int nodeValue,int location) {
		Node node = new Node();
		node.value  = nodeValue;
		
		if ( head == null) {
			createSinglyLinkedList(nodeValue);
			return;
		}else if  ( location == 0) { // first
			node.next = head;
			head = node;
		}else if (location >= size) { // last
			node.next=null;
			tail.next = node;
			tail = node;
		}else {
			Node tempNode = head;
			int index =0;
			while (index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next= nextNode;
		}
		size++;
		return;
	}
	
	
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		
		tail = new Node();
		
		//create a new node
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		
		
		head = node;
		tail = node;
	
		size = 1;
		return head;
	}
	
	
}
