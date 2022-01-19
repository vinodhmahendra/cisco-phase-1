package singlylinkedlist;

public class Driver {

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
		sll.traverseSinglyLinkedList();
		sll.insertInLinkedList(6, 1); //last
		sll.traverseSinglyLinkedList();
		sll.insertInLinkedList(7, 3); //last
		sll.traverseSinglyLinkedList();
		sll.insertInLinkedList(9, 0); //first
		sll.traverseSinglyLinkedList();
		sll.insertInLinkedList(10, 2);
		sll.traverseSinglyLinkedList();
		sll.insertInLinkedList(16, 3);
		sll.traverseSinglyLinkedList();
		
		sll.searchNode(500);
		
		sll.deletionOfNode(3);
		sll.deleteSLL();
		sll.traverseSinglyLinkedList();

	}

}
